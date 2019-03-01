package databaseTesting;

import java.sql.Connection; // getting the Connection for the main Method.
import java.sql.DriverManager; // class used for the String driver to get the connection in the method.
import java.sql.ResultSet;
import java.sql.Statement;


public class DBConnection {

    public static void main(String[] args) throws Exception{

        try {
            getConnection();
        } catch (Exception e) { // essentially it is telling java to catch any errors while connecting to Monogodb.

            e.printStackTrace();
        }

    }
    public static Connection getConnection() throws Exception{ // He is using this method to connect to the terminal.

        try {//This statement will catch any error we have
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/peoplentech";
            String username = "root";
            String password = "";
            String query = "select username from pntstudents";
            Class.forName(driver);

            Connection con = DriverManager.getConnection(url,username,password); // He created an object to get the info from the Mongodb.
            System.out.println("It is successfully connected");


	/*Statement stmt = con.createStatement();
	          ResultSet rs = stmt.executeQuery(query);
	          rs.next();
	          String name = rs.getString(username);

	          System.out.println(name);*/

            //return con;
        }catch(Exception e) {System.out.println(e);

        }
        return null;
    }
}