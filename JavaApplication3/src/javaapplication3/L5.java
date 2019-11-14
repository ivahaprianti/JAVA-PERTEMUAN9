/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author user
 */
public class L5 {
    int jumlahKambing =89;
    
public void getJumlahKambing() {
    System.out.println("Jumlah kambing: " +jumlahKambing);
}
public void tambahKambing() {
    jumlahKambing =jumlahKambing +5;
    System.out.println("Julah Kambing Setelah ditambah: " +jumlahKambing);
}
public static void main(String[] args) {
    L5 kambingSusu = new L5 ();
    
    kambingSusu.getJumlahKambing();
    kambingSusu.tambahKambing();
    kambingSusu.getJumlahKambing();
}
}
