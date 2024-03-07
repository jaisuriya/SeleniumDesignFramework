package databaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		
		
			   String host = "localhost";
			   String port = "3306" ; 
               Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/automation", "root", "4704");
              Statement st = con.createStatement();
              ResultSet rs = st.executeQuery("select * from credentials where scenario='shoppingcard'");
	          while(rs.next()) {
	        	  WebDriver driver = new ChromeDriver();
	        	  driver.get("https://login.salesforce.com");
	        	  driver.manage().window().maximize();
	        	  driver.findElement(By.id("username")).sendKeys(rs.getString("username"));
                  driver.findElement(By.id("password")).sendKeys(rs.getString("password"));
                  
	          
	          }
	}

}
