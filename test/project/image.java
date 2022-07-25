/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/**
 *
 * @author Budi Utomo
 */
public class image {
    public static void main(String args[]) throws Exception{
      java.sql.Connection con = (Connection) koneksi.getKoneksi();
      PreparedStatement pstmt = con.prepareStatement("INSERT INTO 'db_bast'('File PDF') VALUES (?)");
      pstmt.setString(1,"sample image");
      //Inserting Blob type
      InputStream in = new FileInputStream("C:/Users/Budi Utomo/Downloads/pngwing.png");
      pstmt.setBlob(2, in);
      //Executing the statement
      pstmt.execute();
      System.out.println("Record inserted......");
   }
}
