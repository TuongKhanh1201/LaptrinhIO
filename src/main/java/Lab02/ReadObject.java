/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02;

import Lab01.SanPham;
import java.util.ArrayList;
import java.io.*;


/**
 *
 * @author ADMIN
 */
public class ReadObject {
    public static void main(String[] args) {
        ArrayList<SanPham> ds;
        
        try {
            FileInputStream fis = new FileInputStream("sanpham.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ds = (ArrayList<SanPham>) ois.readObject();
            ois.close();
            System.out.println("\nDa doc xong");
            for(SanPham sp : ds){
                System.out.println(sp);
            }
        } catch (Exception ex) {
            System.out.println("Loi xay ra:" + ex.toString());
        }
    }
   
}
