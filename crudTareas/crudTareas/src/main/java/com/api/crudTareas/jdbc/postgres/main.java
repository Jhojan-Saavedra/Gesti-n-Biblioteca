package com.api.crudTareas.jdbc.postgres;
import java.sql.Connection;
import java.sql.DriverManager;

public class main {

    public static void main(String[] args) {
        String user = "postgres";
        String password = "7575";

        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/crudTareas", user, password);
            System.out.println("Conexión exitosa!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

