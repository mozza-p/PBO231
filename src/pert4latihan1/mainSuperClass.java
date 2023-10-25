package pert4latihan1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainSuperClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //instance of class
        subClass sbc = new subClass("","",0);
        System.out.println("INPUT");
        System.out.println("Masukkan nama: ");
        String nama = br.readLine();
        System.out.println("Masukkan keterangan: ");
        String ket = br.readLine();
        System.out.println("Masukkan usia: ");
        int usia = Integer.parseInt(br.readLine());
        sbc = new subClass(nama, ket, usia);
        System.out.println("--Data Sub Class--");
        System.out.println("Nama: " +sbc.getNama());
        System.out.println("Keterangan: " +sbc.getKet());
        System.out.println("Usia: " +sbc.getUsia());
    }
}
