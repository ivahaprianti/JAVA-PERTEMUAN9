/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author user
 */
public class L4 {
    public void tambahKambing(){
        int jumlahKambing =0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println ("Jumlah Kambing setelah ditambah: " +jumlahKambing);
    }
    public static void main(String[] args) {
        //memanggil variable lokal()
        L4 kambingJantan = new L4 ();
        kambingJantan.tambahKambing();
    
}
}