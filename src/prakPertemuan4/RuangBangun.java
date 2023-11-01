package prakPertemuan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RuangBangun {
    public static void main (String[] args) throws IOException {
        int panjang, lebar, tinggi;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //instance of class
        persegiPanjang pp = new persegiPanjang(0,0);
        Balok b = new Balok (0, 0, 0);
        System.out.println("INPUT ANGKA");
        System.out.println("Masukkan Panjang: ");
        panjang = Integer.parseInt(br.readLine());
        //contoh kalo dimasukkan ke dalam set
        //pp.setPanjang(Integer.parseInt(br.readLine()));
        System.out.println("Masukkan Lebar:");
        lebar = Integer.parseInt(br.readLine());
        System.out.println("Masukkan Tinggi:");
        tinggi = Integer.parseInt(br.readLine());
        pp = new persegiPanjang(panjang, lebar);
        b = new Balok(panjang, lebar, tinggi);
        System.out.println("Luas Persegi Panjang: " +pp.luasPersegiPanjang());
        System.out.println("Luas Balok: " +b.getLuasBalok());
        System.out.println("Volume Balok: " +b.getVolBalok());
    }
}
