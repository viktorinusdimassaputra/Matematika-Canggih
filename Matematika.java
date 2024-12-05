/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematika;

/**
 *
 * @author WINDOWS 11
 */
public class Matematika {
    // Metode untuk operasi tambah
    public int tambah(int a, int b) {
        return a + b;
    }

    // Metode untuk operasi kurang
    public int kurang(int a, int b) {
        return a - b;
    }

    // Metode untuk operasi kali
    public int kali(int a, int b) {
        return a * b;
    }

    // Metode untuk operasi bagi
    public int bagi(int a, int b) {
        if (b != 0) { // Menambahkan pengecekan pembagian dengan nol
            return a / b;
        } else {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan");
        }
    }
}
