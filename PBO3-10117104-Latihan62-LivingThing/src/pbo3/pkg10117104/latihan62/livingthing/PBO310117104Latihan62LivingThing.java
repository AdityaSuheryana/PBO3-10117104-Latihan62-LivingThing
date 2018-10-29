/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan62.livingthing;

/**
 *
 * @author
 * Nama : Aditya Suheryana
 * Kelas : IF-3/PBO3
 * Nim : 10117104
 * Deskripsi Program : Menampilkan kegiatan manusia dengan mode Abstraksi
 * 
 */
public class PBO310117104Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
   Human orang = new Human();
        orang.setNama("Aditya Suheryana");
        System.out.print(orang.getNama()+" ");
        orang.walk("");
        System.out.print(orang.getNama()+" ");
        orang.breath("");
        System.out.print(orang.getNama()+" ");
        orang.eat("");
    }
}
