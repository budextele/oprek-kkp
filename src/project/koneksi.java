/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Budi Utomo
 */
public class koneksi {
    private static Connection mySQLConnection;

    public static Connection getKoneksi() throws SQLException {
        try {
            // openconnection
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            // database - oprek_kkp
            // username - admin
            // password - admin
            String urlDB = "jdbc:mysql://localhost:3306/oprek_kkp?useSSL=false";
            String userDB = "admin";
            String passDB = "admin";
            mySQLConnection = DriverManager.getConnection(urlDB, userDB, passDB);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return mySQLConnection;
    }
}
