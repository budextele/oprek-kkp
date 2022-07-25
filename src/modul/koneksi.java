/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul;

//import project.*;
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
            String urlDB = "jdbc:mysql://localhost:3306/project_manager?useSSL=false";
            String userDB = "root";
            String passDB = "";
            mySQLConnection = DriverManager.getConnection(urlDB, userDB, passDB);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return mySQLConnection;
    }
}
