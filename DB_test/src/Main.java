
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stats","root","");
			stmt = conn.createStatement();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		Controller ctrl = new Controller(stmt);
		int nmr = 0;
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("Indtast rang nummer og navn returneres: ");
			nmr = scan.nextInt();
			System.out.println();
			try {
				ctrl.getPlayer(nmr);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println();
		}
		
		
		
//		try {
//			Class.forName("com.mysql.jdbc.Driver").newInstance();
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stats","root","");
//			Statement stm = conn.createStatement();
//			File file = new File("C:\\Users\\ministeren\\Google Drev\\Semester 2\\02327 - Indledende databaser og database programmering\\atptop100.csv");
//			BufferedReader br = new BufferedReader(new FileReader(file));
//			String line;
//			while ((line = br.readLine())!=null) {			    
//				String[] cols = line.split(";");
//				stm.executeUpdate("INSERT INTO atptop100 VALUES ("+cols[0]+",'"+cols[1]+"','"+cols[2]+"','"+cols[3]+"',"+cols[4]+","+cols[5]+","+cols[6]+")");
//			}
//			conn.close();
//			stm.close();
//			br.close();
//
//		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | IOException e) {
//			e.printStackTrace();
//		}		
	
	
	
	}

}
