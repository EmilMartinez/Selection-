package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletingData {

    public static void main(String[] args) throws SQLException {
        String url ="jdbc:mysql://localhost:3306/student";
        String user = "root";
        String pass = "abcd1234";


    try {

        Connection myConn= DriverManager.getConnection(url, user, pass);

        Statement stmt = myConn.createStatement();

        String sql = "Delete FROM Info WHERE stname='Sylvana'";

        int rowsAffected = stmt.executeUpdate(sql);

        System.out.println("Rows Affected:" + rowsAffected);
        System.out.println("Delete complete");
    }catch (Exception e){
        e.printStackTrace();
    }
    }





    }








