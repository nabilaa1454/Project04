/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      DataMahasiswaa a = new DataMahasiswaa();
        System.out.println("------------");
        System.out.println("Menu");
        System.out.println("------------");
        System.out.println("1. Tambahkan Data : ");
        System.out.println("2. Menghapus Data : ");
        System.out.println("3. Mencari Data : ");
        System.out.println("4. Tampilkan Data : ");
        System.out.println("5. Out :");
        Scanner in = new Scanner(System.in);
        System.out.print("Pilih Nomer Menu : ");
        String menu = in.nextLine();
        
      

        //menambah beberapa data mahasiswa kedalam array list
        a.tambahMahasiswaa(new Mahasiswaa("K351900", "Amel", "01/02/2003", 1));
        a.tambahMahasiswaa(new Mahasiswaa("K351944", "Bisma", "03/02/2003", 0));
        a.tambahMahasiswaa(new Mahasiswaa("K351990", "Cici", "01/04/2003", 1));
        
        //menampilkan semua data mahasiswa dari array list
        a.tampilMahasiswa();
        
        //mencari data baarang bernim 'K351990'
        a.cariMahasiswaa("K3519044");
        
        //tamilkan data lagi untuk melakukan perubahan
        a.tampilMahasiswa();
       
    }
    
}
