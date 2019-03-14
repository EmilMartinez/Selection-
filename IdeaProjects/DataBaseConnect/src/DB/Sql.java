package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class Sql {


        public static void main(String[] args) throws Exception {

            try {
                getConnection();
            } catch (Exception e) {

                e.printStackTrace();
            }

        }

        public static Connection getConnection() throws Exception {

            try {//This statement will catch any error we have
                String driver = "com.mysql.cj.jdbc.Driver";
                String url = "jdbc:mysql://localhost:3306/_emil_";
                String username = "root";
                String password = "abc1234 ";


                Class.forName(driver);
                Connection con = DriverManager.getConnection(url, username, password); // use the third one that uses u, u and p).
                System.out.println("It is successfully connected");


            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(e);

            }
            return null;
        }
    }