package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class getEmp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		// TODO Auto-generated method stub
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	
		System.out.println("Connection Established");
	
		
	    Statement st= con.createStatement();
	    
	    ResultSet rs = st.executeQuery("select * from emp1");
	    
	   
	    while(rs.next())
	    {
	    	System.out.println("empno: "+rs.getInt(1));
	    	System.out.println("ename: "+rs.getString(2));
	    	System.out.println("sal: "+rs.getInt(3));
	    	
	    	System.out.println("===========================");
	    	
	    	
	    }
	    
		rs.close();
		con.close();
		
	}

}
