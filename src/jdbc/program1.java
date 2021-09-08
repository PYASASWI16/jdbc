package jdbc;
import java.sql.*;
public class program1 {
	public static void main (String args[]) throws ClassNotFoundException, SQLException {
		Connection con =null;
		Statement stmt=null;
		ResultSet rs = null;
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String username="system";
		String password="pwd";
		
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con = DriverManager.getConnection(url,username,password);
		stmt= con.createStatement();
		rs=stmt.executeQuery("Select * from emp_table");
		
		while(rs.next()) {
			System.out.print(" " +rs.getString(1));
			System.out.print(" " +rs.getInt(2));
			System.out.print(" " +rs.getDate(3));
			System.out.print(" "+rs.getDouble(4));
			System.out.println();
		}
		
		
		rs.close();
		con.close();
		stmt.close();
			
		}
}
