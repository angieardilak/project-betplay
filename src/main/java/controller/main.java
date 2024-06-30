package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
     public static void start(String[] args) {
         String url = "jdbc:mysql://localhost:3306/test";
         String user = "root";
         String password = "karol@1014198153";
         try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            String deleteSQL = "DELETE FROM category WHERE id = 1";
            int rowsDeleted = statement.executeUpdate(deleteSQL);
            System.out.println("Número de filas eliminadas: " + rowsDeleted);

        } catch (SQLException e) {
            e.printStackTrace();
        }
}
    ;
}
     try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            String deleteSQL = "DELETE FROM category WHERE id = 1";
            int rowsDeleted = statement.executeUpdate(deleteSQL);
            System.out.println("Número de filas eliminadas: " + rowsDeleted);

        } catch (SQLException e) {
            e.printStackTrace();
        }
}
