/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import java.util.ArrayList;
import java.util.Scanner;

public class DataMahasiswaa {
    //atribut untuk menyimpan data-data mahasiswa
    ArrayList<Mahasiswaa> dataMahasiswaa = new ArrayList<Mahasiswaa>();
    
  
        //menambah data mahasiswa baru kedalam array list
        void tambahMahasiswaa(Mahasiswaa data){
            this.dataMahasiswaa.add(data);
        }

        //menghapus data mahasiswa bernim tertentu dari array list
        void hapusMahasiswaa(String nim){
            this.dataMahasiswaa.removeIf(item -> item.nimMahasiswaa == nim);
        }

        //mencari data mahasiswa bernim tertentu dari array list
        void cariMahasiswaa(String nim){
            boolean ditemukan = false;
            int index = -1;
            for(int i=0; i<this.dataMahasiswaa.size(); i++){
                if (this.dataMahasiswaa.get(i).nimMahasiswaa == nim){
                    index = i;
                    ditemukan = true;
                }
            }
            if (ditemukan == true){
            this.dataMahasiswaa.get(index).print();
            } else {
                System.out.println("Data Mahasiswa Tidak Ditemukan.");   
            }
        }
        //menampilkan seluruh data yang tersimpan dalam array list
        void tampilMahasiswa(){
            System.out.println("----------------------");
            for(Mahasiswaa item: this.dataMahasiswaa){
                item.print();
            }
        }
}
