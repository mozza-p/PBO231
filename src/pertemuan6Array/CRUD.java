package pertemuan6Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CRUD {
    //class ini merupakan kumpulan menu program
    /* di class ini bisa:
     *   1. menambahkan import lib java IO di setiap methos
     *   2. menambhakan tipe dara array utk penyimpanan array
     *   3. buffered reader di tambahkan di mmasing" method
     */


    //array : 1[baris] dan 2[baris][kolom] dimensi
    //deklarasi array berdasar class yg ada (laundry dan transaksi)

    Laundry master[];
    transaksiLaundry transaksi [];

    String jenis, metode, kode, nmaa, tglCuci, tglAmbil;
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
        }
        public void cetakData() throws IOException{
        System.out.println("---CETAK DATA---");
            for (int i = 0; i < transaksi.length; i++) {
            transaksi[i].transaksi();
            }
    }
    public void cariData() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--CARI DATA--");
        
    }
}
