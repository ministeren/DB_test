import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Controller {
	private Statement stmt;
	private ResultSet rs;

	public Controller(Statement stmt){
		this.stmt=stmt;

	}

	public void getPlayer(int rang) throws SQLException{
		String sql = "select last_name, first_name from atptop100 where rang = "+rang;
		rs = stmt.executeQuery(sql);
		String first = null;
		String last = null;
		if(rs.next()){
			first = rs.getString("first_name");
			last = rs.getString("last_name");
		}
		System.out.print(first);
		System.out.print(" ");
		System.out.println(last);

	}



}
