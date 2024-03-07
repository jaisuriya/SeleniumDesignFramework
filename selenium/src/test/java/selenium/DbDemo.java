package selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
       String dbUrl= ("jdbc:mysql://localhost:3306/sakila");
       String usrname = "root";
       String pwd = "4704";
       
       Class.forName("com.mysql.jdbc.Driver");
       
       Connection con = DriverManager.getConnection(dbUrl,usrname,pwd);
       
       Statement st = con.createStatement();
       
       String selectquery = "select * from customer where first_name like '%p'";
       ResultSet rs = st.executeQuery(selectquery);
       int i = 1;
       while(rs.next()) {
    	       System.out.println("CustomerId: "+i);
    	       System.out.println("store_id"+rs.getString("store_id"));
    	       System.out.println("firstname: "+rs.getString("first_name"));
    	       System.out.println("lastname: "+rs.getString("last_name"));
    	       System.out.println("email: "+rs.getString("email"));
    	       System.out.println("address: "+rs.getString("address_id"));
    	       System.out.println("active: "+rs.getString("active"));
    	       System.out.println("**********************************************");
    	       i++;
    	       
    	       
    	   
       }
       
       con.close();
       

	}
	
	

}
