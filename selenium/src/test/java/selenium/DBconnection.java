package selenium;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBconnection {

	public static void main(String[] args) throws InterruptedException, ClassNotFoundException, SQLException {

      String Dburl = "jdbc:mysql://localhost:3306/world";
      String userName = "root";
      String Password = "4704";
      
     Class.forName("com.mysql.jdbc.Driver");
      
      Connection con = DriverManager.getConnection(Dburl,userName,Password);
      
      Statement st = con.createStatement();
      String selectquery = "select * from city where CountryCode = 'IND' and District ='Maharashtra';";
      ResultSet rs = st.executeQuery(selectquery);
      int i = 1;
      while(rs.next()) {
    	  System.out.println("Record: "+ i);
    	  System.out.println("City Name: "+rs.getString("Name"));
    	  System.out.println("CountryCode: "+rs.getString("CountryCode"));
    	  System.out.println("District Name: "+rs.getString("District"));
    	  System.out.println("Population: "+rs.getString("Population"));
    	  System.out.println("***********************************************");
    	  i++;
          }
          con.close();
	      }
          }
