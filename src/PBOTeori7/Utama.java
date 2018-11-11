/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PBOTeori7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


/**
 *
 * @author smart
 */
public class Utama {

     public static
           ArrayList<mhs> mahasiswa = new ArrayList<>();
     
    public static void input(){
    mhs n = new mhs();
    Scanner s = new Scanner(System.in);
        System.out.println("Inputan");
        System.out.print("Masukkan Nim : ");
        String nim = s.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = s.nextLine();
        System.out.print("Masukkan Ipk : ");
        double ipk = s.nextDouble();
        System.out.println("");
        
        n.setNim(nim);
        n.setNama(nama);
        n.setIpk(ipk);
    mahasiswa.add(n);
    }
    public static void tampil(){
        if(mahasiswa.isEmpty()){
            System.out.println("Anda harus menginputkan data lagi");
        }
        else{
        int bil=1;
        System.out.println("Tampil Data");
        for (mhs tamp : mahasiswa ) {
        System.out.println("Data ke- "+bil);
        System.out.println("Nim :"+tamp.getNim());
        System.out.println("Nama : "+tamp.getNama());
        System.out.println("Ipk : "+tamp.getIpk());
            System.out.println("");   
        bil++;  
        }  
      }
    }
    public static void sorting(){
       int pil = 0;
       ArrayList<mhs> tampungan = new ArrayList<>();
       Scanner s = new Scanner(System.in);
       while(pil<=4){
        System.out.println("Sorting");
        System.out.println("1. Sorting by nim");
        System.out.println("2. Sorting by nama");
        System.out.println("3. Sorting by Ipk");
        System.out.println("4. Kembali ke menu utama");
        System.out.print("Masukkan Pilihan : ");
        pil = s.nextInt();
        switch(pil){
            case 1 : 
                Collections.sort(mahasiswa, new Comparator<mhs>()
                {
                @Override
                public int compare(mhs m1, mhs m2){
                    return m1.getNim().compareTo(m2.getNim());
                        }
                    }
                );
                tampil();
                break;
            case 2 : 
                Collections.sort(mahasiswa, new Comparator<mhs>()
                {
                @Override
                public int compare(mhs m1, mhs m2){
                    return m1.getNama().compareTo(m2.getNama());
                    }
                   }
                );
                tampil();
                break;              
            case 3 :  
              for (int i=0; i<mahasiswa.size(); i++){
               for(int j=0; j<mahasiswa.size()-1;j++){
                   if(mahasiswa.get(j).getIpk()>mahasiswa.get(j+1).getIpk()){
                      tampungan.add(mahasiswa.get(j));
                      mahasiswa.set(j,mahasiswa.get(j+1));
                      mahasiswa.set(j+1,tampungan.get(0));
                      tampungan.clear();
                   }
                }
              } 
              tampil();            
            break;   
        }
        pil++; 
        }
    }   
    public static void main(String[] args) {
        int pilihan=0;
        Utama t = new Utama();
        
        while(pilihan <=4 ){
        Scanner s = new Scanner(System.in);
        System.out.println("1. Input Data");
        System.out.println("2. Tampil Data");
        System.out.println("3. Sorting Data");
        System.out.println("4. exit");
            System.out.print("Masukkan piliahan : ");
            pilihan = s.nextInt();
            switch(pilihan){
                case 1 :
                    input();
                    break;
                case 2 :
                    tampil();
                    break;
                case 3 :
                    sorting();
                    break;
                case 4 :
                    System.exit(0);
                   break;
            }
            pilihan++;
        }
      } 
    
}
