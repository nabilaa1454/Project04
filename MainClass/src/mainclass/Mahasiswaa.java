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
public class Mahasiswaa {
    //atribut
    String nimMahasiswaa;
    String namaMahasiswaa;
    String tglLahir;
    int genderMahasiswaa;
    
    //konstruktor
    Mahasiswaa(String nim, String nama, String tgllahir, int gender){
        this.nimMahasiswaa = nim;
        this.namaMahasiswaa = nama;
        this.tglLahir = tgllahir;
        this.genderMahasiswaa = gender;
    }  
    //method untuk menampilkan object Mahasiswi
    void print(){
        System.out.println("-------------");
        System.out.println("Mahasiswa");
        System.out.println("-------------");
        System.out.println("Nim Mahasiswa: " + this.nimMahasiswaa);
        System.out.println("Nama Mahasiswa: " + this.namaMahasiswaa);
        System.out.println("TglLahir Mahasiswa: " + this.tglLahir);
        System.out.println("Gender (0:laki-laki, 1:Perempuan): " + this.genderMahasiswaa);  
    }
}