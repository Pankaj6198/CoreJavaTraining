package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DmlDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	
		System.out.println("Connection Established");
	
		Statement st = con.createStatement();
		
		String str = "insert into emp1 values(4,'Pankaj',380)";
		
		String str1 = "update emp1 set sal = 38000 where empno = 4 ";
		
		// st.executeUpdate(str);
		// st.executeUpdate(str1);
		
		con.close();
	
	}

}
