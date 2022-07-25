/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oprek_kkp;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;

import project.koneksi;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.imageio.ImageIO;
/**
 *
 * @author Budi Utomo
 */
public class Oprek_kkp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, FileNotFoundException, IOException {
        // TODO code application logic here

//        loginPage login = new loginPage();
//        login.setVisible(true);


 java.sql.Connection con = (Connection) koneksi.getKoneksi();


PreparedStatement p;
 File ImgPath = new File("C:\\Users\\Budi Utomo\\Downloads\\pngwing.png");
 FileInputStream fin = new FileInputStream(ImgPath);
    BufferedImage bufferedimage = ImageIO.read(ImgPath);

    WritableRaster raster = bufferedimage.getRaster();
    DataBufferByte data = (DataBufferByte) raster.getDataBuffer();




//    String query = "INSERT INTO tes VALUES(?,1);";
String query = "INSERT INTO db_bast (File_PDF) VALUES (?);";
    p = con.prepareStatement(query);
p.setBinaryStream(1, fin, (int) ImgPath.length());
    p.execute();
    }}
