package pertemuan4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Utama {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nama, telp, tujuan, nmPesawat, username, password;
    Tiket pemesan = new Tiket("","","");
    Tiket pesawat = new Tiket ("", 0, 0);
    int jmlPenumpang, hrgPesawat;
        try{
            do{
                System.out.print("Masukkan username Anda");
                username = br.readLine();
                System.out.print("Masukkan password Anda");
                password = br.readLine();
                System.out.println("--PEMESANAN TIKET--");
                System.out.println("1. Input Data Transaksi");
                System.out.println("2. Lihat Data Tiket");
                System.out.println("3. Keluar");
                System.out.println("Pilih menu:");
                int menu = Integer.parseInt(br.readLine());
                switch (menu) {
                    case 1:
                        System.out.print("1. Input Data Transaksi");
                        System.out.print("Nama Pemesan: ");
                        nama = br.readLine();
                        System.out.print("Nomor Telepon Pemesan: ");
                        telp = br.readLine();
                        System.out.print("Tujuan Pesawat: ");
                        tujuan = br.readLine();
                        System.out.print("Nama Pesawat");
                        nmPesawat = br.readLine();
                        System.out.print("Jumlah Penumpang: ");
                        jmlPenumpang = Integer.parseInt(br.readLine());
                        System.out.print("Harga Pesawat: ");
                        hrgPesawat= Integer.parseInt(br.readLine());
                        pesawat = new Tiket(nmPesawat, jmlPenumpang, hrgPesawat);
                        System.out.println("Harga Tiket: " +pesawat.getTiket());
                        System.out.println("Total Harga Tiket: "+pesawat.getTotalPesawat());
                        break;
                    case 2:
                        pemesan = new Tiket(nama, telp, tujuan);
                        System.out.print("Nama Pesawat " +pemesan.getNama());
                        System.out.print("Nomor Telepon " +pemesan.getTelp());
                        System.out.print("Tujuan " +pemesan.getTujuan());
                        System.out.println("Harga Tiket " +pesawat.getTiket());
                        System.out.println("Total Harga Tiket "+pesawat.getTotalPesawat());
                        break;
                    default:
                     System.exit(menu);
                }
            } while(true);
        }catch (Exception ec){
            System.out.println(ec.getMessage());
        }
    }
}

