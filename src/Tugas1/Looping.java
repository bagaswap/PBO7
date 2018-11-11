/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tugas1;

import java.util.Scanner;

/**
 *
 * @author smart
 */
public class Looping {
    public static void main(String[] args) {
        int pil;
        Scanner s = new Scanner(System.in);
        do{
        System.out.println("1. Masukkan data");
        System.out.println("2. Tampilkan data");
        System.out.println("3. Keluar");
        System.out.print("Masukkan Pilihan Anda : ");
        pil=s.nextInt();
        }while(pil!=3);
       
    }
}
