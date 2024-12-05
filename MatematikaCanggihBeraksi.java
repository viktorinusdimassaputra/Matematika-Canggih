/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

/**
 *
 * @author WINDOWS 11
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih mtkCanggih = new MatematikaCanggih();

        System.out.println("Tambah: " + mtkCanggih.tambah(510, 312));
        System.out.println("Kurang: " + mtkCanggih.kurang(649, 271));
        System.out.println("Kali: " + mtkCanggih.kali(782, 311));
        System.out.println("Bagi: " + mtkCanggih.bagi(10800, 200));
        System.out.println("Modulus: " + mtkCanggih.modulus(56, 3));
        System.out.println("Kombinasi (Tambah + Kali): " + mtkCanggih.kombinasiTambahKali(52, 31, 200));
    }
}


