/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.util.Scanner;
/**
 *
 * @author fadil
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double result = 0;
System.out.println("==== Aplikasi Kalkulator Sederhana====");
System.out.println("Pilihan Operasi:\n"
        + " 1. Penjumlahan\n"
        + " 2. Pengurangan\n"
        + " 3. Pekalian\n"
        + " 4. Pembagian\n");
System.out.print("Masukkan pilihan: ");
Scanner operation = new Scanner(System.in);
int option = operation.nextInt();
//input bilangan
System.out.print("Masukkan bilangan 1: ");
Scanner val1 = new Scanner(System.in);
double bil1 = val1.nextDouble();
System.out.print("Masukkan bilangan 2: ");
Scanner val2 = new Scanner(System.in);
double bil2 = val1.nextDouble();
//switch case operasi
switch(option) {
 case 1:
 System.out.println("\nPenjumlahan");
 result = bil1 + bil2;
 System.out.format("Hasil: %.2f\n", result);
 break;

 case 2:
 System.out.println("\nPengurangan");
 result = bil1 - bil2;
 System.out.format("Hasil: %.2f\n", result);
 break;
 case 3:
 System.out.println("\nPerkalian");
 result = bil1 * bil2;
 System.out.format("Hasil: %.2f\n", result);
 break;
 case 4:
System.out.println("\nPembagian");
result = bil1/bil2;
System.out.format("Hasil: %.2f\n", result);
break;
}

    }
    
}
