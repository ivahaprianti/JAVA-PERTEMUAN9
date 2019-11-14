/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class latihan4 {
    public void tambahKambing(){
        int jumlahKambing =0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println ("Jumlah Kambing setelah ditambah: " +jumlahKambing);
    }
    public static void main(String[] args) {
        //memanggil variable lokal()
        latihan4 kambingJantan = new latihan4 ();
        kambingJantan.tambahKambing();
    
}
}

