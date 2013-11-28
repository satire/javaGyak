package javaLottoSQLite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class javaLottoSQLite {

	static Connection prepareDB(){
		Connection c = null;
		Statement stmt = null;
		
		try {
			Class.forName("org.sqlite.JDBC");			
			c = DriverManager.getConnection("jdbc:sqlite:javaLottoSQLite/lotto.db");
			stmt = c.createStatement();
						
			try {
				BufferedReader br = new BufferedReader(new FileReader("javaLottoSQLite/lotto.csv"));
				String line;
				String sql = "CREATE TABLE lotto "
						+ "(ev			INT						NOT NULL,"
						+ " het			INT						NOT NULL, "
						+ " datum		DATE 	PRIMARY KEY		NOT NULL, "
						+ " num5		INT, " 
						+ " ft5			INT, " 
						+ " num4		INT, "
						+ " ft4			INT, " 
						+ " num3		MEDIUMINT, " 
						+ " ft3			INT, "
						+ " num2		MEDIUMINT, " 
						+ " ft2			INT, "
						+ " szam1		TINYINT, " 
						+ " szam2		TINYINT, "
						+ " szam3		TINYINT, " 
						+ " szam4		TINYINT, "
						+ " szam5     	TINYINT)";

				stmt.executeUpdate(sql);

				stmt = c.createStatement();				
				
				while ((line = br.readLine()) != null) {

					String[] values = line.split(";");
					int ev = Integer.parseInt(values[0]);
					if (ev > 2004) {

						String het = values[1];

						String datum = values[2];
						datum = datum.substring(0, datum.length() - 1);// http://stackoverflow.com/questions/7438612/how-to-remove-the-last-character-from-a-string
						datum = datum.replace(".", "-"); // http://www.tutorialspoint.com/java/java_string_replace.htm

						String num5 = values[3];
						String ft5 = values[4];
						ft5 = ft5.replace(" Ft", "");
						ft5 = ft5.replace(" ", "");

						String num4 = values[5];
						String ft4 = values[6];
						ft4 = ft4.replace(" Ft", "");
						ft4 = ft4.replace(" ", "");

						String num3 = values[7];
						String ft3 = values[8];
						ft3 = ft3.replace(" Ft", "");
						ft3 = ft3.replace(" ", "");

						String num2 = values[9];
						String ft2 = values[10];
						ft2 = ft2.replace(" Ft", "");
						ft2 = ft2.replace(" ", "");

						String szam1 = values[11];
						String szam2 = values[12];
						String szam3 = values[13];
						String szam4 = values[14];
						String szam5 = values[15];

						try {
							
							stmt.executeUpdate("INSERT INTO lotto VALUES('"
									+ ev + "', '" + het + "', '" + datum
									+ "', '" + num5 + "', '" + ft5 + "', '"
									+ num4 + "', '" + ft4 + "', '" + num3
									+ "', '" + ft3 + "', '" + num2 + "', '"
									+ ft2 + "', '" + szam1 + "', '" + szam2
									+ "', '" + szam3 + "', '" + szam4 + "', '"
									+ szam5 + "');");
							
						}catch (Exception e) {
							System.err.println(e.getClass().getName() + ": "+ e.getMessage());
							break;
						}finally{
							br.close();
						}
					} else {						
						break;
					}
				}				

			}catch (Exception e) {
				System.err.println("connect(): " + e.getClass().getName()+ ": " + e.getMessage());
			}finally{
				stmt.close();
			}
		}catch (Exception e) {
			System.err.println("connect(): " + e.getClass().getName() + ": "+ e.getMessage());
			System.exit(0);
		}
		//System.out.println();
		System.out.println("connect(): Sikerült csatlakozni az adatbázishoz!");
		return c;

	}	
	
	public static void main(String[] args) throws SQLException,
			NumberFormatException, IOException {

		Connection sqliteConnection = prepareDB();
		Statement stmt = sqliteConnection.createStatement();
		ResultSet rs = stmt
				.executeQuery("SELECT AVG(ft5) AS atlag FROM lotto WHERE num5 > 0;");
		System.out.println();
		while (rs.next()) {
			int atlag = rs.getInt("atlag");
			System.out.println("# Average:  " + atlag);
		}

		rs = stmt
				.executeQuery("SELECT datum, MAX(ft5) AS max, szam1, szam2, szam3, szam4, szam5 FROM lotto;");
		while (rs.next()) {
			String datum = rs.getString("datum");
			long max = rs.getLong("max");
			short szam1 = rs.getShort("szam1");
			short szam2 = rs.getShort("szam2");
			short szam3 = rs.getShort("szam3");
			short szam4 = rs.getShort("szam4");
			short szam5 = rs.getShort("szam5");
			System.out
					.println("# Max:  " + datum + ", " + max + ", " + szam1
							+ ", " + szam2 + ", " + szam3 + ", " + szam4 + ", "
							+ szam5);
		}

		rs = stmt
				.executeQuery("SELECT datum, ft5, szam1, szam2, szam3, szam4, szam5 FROM lotto ORDER BY datum;");

		// http://stackoverflow.com/questions/15215326/how-can-i-create-a-table-in-java-in-a-console
		String leftAlignFormat = "| %-15s | %-15s | %-7d | %-7d | %-7d | %-7d | %-7d |%n";
		System.out
				.format("+-----------------+-----------------+---------+---------+---------+---------+---------+%n");
		System.out
				.printf("| Dátum           | Nyeremény       | 1. szám | 2. szám | 3. szám | 4. szám | 5. szám |%n");
		System.out
				.format("+-----------------+-----------------+---------+---------+---------+---------+---------+%n");

		while (rs.next()) {
			String datum = rs.getString("datum");
			long ft5 = rs.getLong("ft5");
			short szam1 = rs.getShort("szam1");
			short szam2 = rs.getShort("szam2");
			short szam3 = rs.getShort("szam3");
			short szam4 = rs.getShort("szam4");
			short szam5 = rs.getShort("szam5");

			System.out.format(leftAlignFormat, datum, ft5, szam1, szam2, szam3,
					szam4, szam5);
			System.out
					.format("+-----------------+-----------------+---------+---------+---------+---------+---------+%n");
		}
		rs.close();
		stmt.close();
		sqliteConnection.close();
	}

}
