package pertemuan2;
import pertemuan1.contoh;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tes2 {
    public static void main(String[] args) {
        //objek br
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //instance of class
        contoh2 c = new contoh2();
        //error handling
        try {
            //blok kode dengan asumsi benar
            //berisi input,output
            System.out.println("---Input Data Mhs---");
            System.out.println("---NIM Mhs---");
            c.setNim(br.readLine());
            System.out.println("---Nama Mhs---");
            c.setNama(br.readLine());
            System.out.println("---Prodi Mhs---");
            c.setProdi(br.readLine());
            System.out.println("---Mata Kuliah Mhs---");
            c.setMk(br.readLine());
            System.out.println("---Nilai UTS Mhs---");
            c.setUts(Integer.parseInt(br.readLine()));
            System.out.println("---Nilai UAS Mhs---");
            c.setUas(Integer.parseInt(br.readLine()));
            System.out.println("---Nilai Tugas Mhs---");
            c.setTugas(Integer.parseInt(br.readLine()));
            c.cetakDataMhs();
        } catch (Exception ec) {
            //isinya mengikuti apa yang salah
            //blok kode untuk menjalankan info kesalahan dari blok try
            System.out.println(ec.getMessage());
        }
    }
}
