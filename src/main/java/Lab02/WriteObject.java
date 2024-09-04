/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02;

import java.util.ArrayList;
import java.io.*;
import Lab01.SanPham;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class WriteObject {
    public static void main(String[] args) {
        ArrayList <SanPham> ds = new ArrayList<>();
       Scanner sc = new Scanner (System.in);
        
        try {
            FileOutputStream fo = new FileOutputStream("sanpham.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            for(int i= 0;i<3;i++){
                System.out.println("Thong tin san pham:" +(i+1));
                System.out.println("Nhap ma so:");
                String maso= sc.nextLine();
                System.out.println("Nhap ten:");
                String ten = sc.nextLine();
                System.out.println("Nhap gia:");
                float gia = sc.nextFloat();
                sc.nextLine();
                SanPham sp = new SanPham(maso, ten, gia);
                ds.add(sp);
            }
            oos.writeObject(ds);
            oos.close();
            System.out.println("\nDa ghi xong");
        } catch (Exception ex) {
            System.out.println("Loi xay ra:" + ex.toString());
            System.out.println("Ghi file that bai");
        }
    }
}
