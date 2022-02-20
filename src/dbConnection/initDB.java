package dbConnection;

import java.sql.*;
import user.*;

/**
 * Initialize SQL Database
 */
public class initDB {

    // RDS Credentials
    public static String url = "jdbc:mysql://treehacks.csujazrx8x7h.us-east-1.rds.amazonaws.com";
    public static String user = "admin";
    public static String password = "alimsuzuki";

    public static void main(String[] args) {

        try {
            // establish connection
            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();

            // create database
            statement.execute("CREATE DATABASE emotions");

            // create table
            statement.execute("CREATE TABLE emotions_log(Anger_Likeliness VARCHAR(50), " +
                    "Joy_Likeliness VARCHAR(50), Sorrow_Likeliness VARCHAR(50), Surprise_Likeliness VARCHAR(50))");

            // log user info into table
            userLog log = new userLog(); // TODO: temp var until we make a class to get actual user log
            writeEmotion(connection, log);


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Write emotions of the user for up to 7 most recent days into database
     * @param c connection to SQL database
     * @param log of user emotions
     */
    public static void writeEmotion(Connection c, userLog log) {
        try {
            Statement statement = c.createStatement();
            for (user user : log.userEmotions) {
                String anger = user.anger.likeliness;
                String joy = user.joy.likeliness;
                String sorrow = user.sorrow.likeliness;
                String surprise = user.surprise.likeliness;

                String command = "INSERT INTO emotions_log (Anger_Likeliness, Joy_Likeliness, " +
                        "Sorrow_Likeliness, Surprise_Likeliness) VALUES (?, ?, ?, ?)";
                PreparedStatement ps = c.prepareStatement(command);
                ps.setString(1, anger);
                ps.setString(2, joy);
                ps.setString(3, sorrow);
                ps.setString(4, surprise);

                ps.execute();

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}