/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab01;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;


/**
 *
 * @author ADMIN
 */
public class WriteTextFile {
    public static void main(String[] args) {
        ArrayList<SanPham> ds= new ArrayList<>();
       Scanner sc= new Scanner (System.in);
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
        
        try {
            FileWriter fw =new FileWriter("sanpham.txt");
            for(SanPham sp: ds){
                fw.write(sp.getMaso() + ";" + sp.getTen() + ";" + sp.getGia() + "\n");
            }
            fw.close();
            System.out.println("Ghi file thanh cong");
        } catch (Exception ex) {
            System.out.println("loi xay ra:" + ex.toString());
            System.out.println("Ghi file that bai:");
        }
    }
}
