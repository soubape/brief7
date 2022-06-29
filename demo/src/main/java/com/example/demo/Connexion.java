package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
    public static final String DRIVER_CLASS = "org.postgresql.Driver";
    public static final String URL = "jdbc:postgresql://localhost/db_briefe5";
    public static final String USER = "postgres";
    public static final String PASSWORD = "nawan";

    //private constructor
    public Connexion() {
        try {
            Class.forName(DRIVER_CLASS);
            System.out.println(Class.forName(DRIVER_CLASS));
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public static Connection createConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion etablie avec succes !");
            return connection;
        } catch (SQLException e) {
            System.out.println("ERREUR : Imposssible de se connecter a la base de donnee." + e);
        }
        return null;
    }

}
