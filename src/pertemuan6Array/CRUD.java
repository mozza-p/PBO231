package pertemuan6Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CRUD {
    //class ini merupakan kumpulan menu program
    /* di class ini bisa:
     *   1. menambahkan import lib java IO di setiap method
     *   2. menambahkan tipe dara array utk penyimpanan array
     *   3. buffered reader di tambahkan di masing" method
     */


    //array : 1[baris] dan 2[baris][kolom] dimensi
    //deklarasi array berdasarkan class yg ada (laundry dan transaksi)
    //lakukan deklarasi array di setiap method

    Laundry master[];
    transaksiLaundry trans[];

    String jenis, metode, kode, nama, tglCuci, tglAmbil;
    int harga, berat;

    public void insertMasterData() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //perlu 2 data utk input master
        //deklarasi ulang array
        master = new Laundry[2];
        //ketika menggunakan array, input dan output menggunakan loop-->for
        for (int i = 0; i < master.length; i++) {
            //copas dr main class menu 1
            System.out.println("---1. Menu Master Data---");
            System.out.println("Entri jenis cucian : ");
            jenis = br.readLine();
            System.out.println("Entri harga : ");
            harga = Integer.parseInt(br.readLine());
            System.out.println("Entri metode : ");
            metode = br.readLine();
            master[i] = new Laundry(jenis, metode, harga);
            System.out.println();
        }

    }
    public void insertTransaksi() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        trans = new transaksiLaundry[2];
        for (int i = 0; i < trans.length; i++) {
            System.out.println("2. Menu Transaksi");
            System.out.println("Entri kode: ");
            kode = br.readLine();
            System.out.println("Entri nama: ");
            nama = br.readLine();
            System.out.println("Entri jenis cuci \nCuci Setrika/Cuci Kering: ");
            jenis = br.readLine();
            System.out.println("Entri metode (Regular/Express): ");
            metode = br.readLine();
            System.out.println("Entri berat: ");
            berat = Integer.parseInt(br.readLine());
            System.out.println("Entri tanggal cuci: ");
            tglCuci = br.readLine();
            System.out.println("Entri tanggal ambil: ");
            tglAmbil = br.readLine();
            trans[i] = new transaksiLaundry(jenis, metode, harga, kode, nama, tglCuci, tglAmbil, berat);
            System.out.println();
        }
    }
    public void cetakData() throws IOException {
        System.out.println("---CETAK DATA---");
        for (int i = 0; i < trans.length; i++) {
        trans[i].transaksi();

        }
    }
    public void cariData() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--CARI DATA--");
        System.out.println("---3. Menu Cari Data---");
        System.out.println("Entri kode transaksi yang dicari : ");
        kode = br.readLine();
        //cek apakah kode yang diisi sm dgn yang disimpan
        for (int i = 0; i < trans.length ; i++) {
            if (kode.equalsIgnoreCase(trans[i].getKode())){
                trans[i].transaksi();
            } else {
                System.out.println("Data tidak ada");
            }
        }
        
    }
}
