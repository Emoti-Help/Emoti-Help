package dbConnection;

import java.sql.*;

public class getData {

    // RDS Credentials
    public static String url = "jdbc:mysql://treehacks.csujazrx8x7h.us-east-1.rds.amazonaws.com";
    public static String user = "admin";
    public static String password = "alimsuzuki";

    public static void main(String[] args) {

        try {
            // establish connection
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();

            // query data


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}