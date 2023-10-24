package pertemuan4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Utama {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nama, telp, tujuan, nmPesawat, nmHotel;
        int jmlKamar, hrgKamar, jmlPenumpang, hrgPesawat;


        Tiket pemesan = new Tiket("", "", "", "", 0, 0,
        "", 0, 0);
        try{
            do{
                System.out.println("--PEMESANAN TIKET--");
                System.out.println("1. Input Data Transaksi");
                System.out.println("2. Lihat Data Tiket");
                System.out.println("3. Keluar");
                System.out.println("Pilihan Anda:");
                int menu = Integer.parseInt(br.readLine());
                switch (menu) {
                    case 1:
                        System.out.println("Silahkan input Data Transaksi Anda");
                        System.out.println("Nama Pemesan: ");
                        nama = br.readLine();
                        System.out.println("Nomor Telepon Pemesan: ");
                        telp = br.readLine();
                        System.out.println("Nama Hotel: ");
                        nmHotel = br.readLine();
                        System.out.println("Jumlah Kamar: ");
                        jmlKamar = Integer.parseInt(br.readLine());
                        System.out.println("Harga per Kamar: ");
                        hrgKamar = Integer.parseInt(br.readLine());
                        System.out.println("Nama Pesawat");
                        nmPesawat = br.readLine();
                        System.out.println("Jumlah Penumpang: ");
                        jmlPenumpang = Integer.parseInt(br.readLine());
                        System.out.println("Harga Pesawat: ");
                        hrgPesawat= Integer.parseInt(br.readLine());
                        System.out.println("Tujuan Pesawat: ");
                        tujuan = br.readLine();
                        pemesan = new Tiket(nama, telp, tujuan, nmHotel, jmlKamar,hrgKamar,
                                nmPesawat, jmlPenumpang, hrgPesawat);
                        break;
                    case 2:
                        System.out.println("--DATA TIKET PEMESAN--");
                        System.out.println("Nama Pemesan: " +pemesan.getNama());
                        System.out.println("Nomor Telepon Pemesan: " +pemesan.getTelp());
                        System.out.println("Tujuan: " +pemesan.getTujuan());
                        System.out.println("Nama Hotel: " +pemesan.getNmHotel());
                        System.out.println("Jumlah Kamar: " +pemesan.getjmlKamar());
                        System.out.println("Harga per Kamar: "+pemesan.getHrgKamar());
                        System.out.println("Total Biaya Kamar dengan Tambahan Diskon 45%: "+pemesan.getTotalHotel());
                        System.out.println("Nama Pesawat: " +pemesan.getnmPesawat());
                        System.out.println("Jumlah Penumpang: " +pemesan.getjmlPenumpang());
                        System.out.println("Harga Tiket Pesawat: " +pemesan.gethrgPesawat());
                        System.out.println("Total Harga Tiket Pesawat: " +pemesan.getTotalPesawat() + "dengan biaya asuransi 29.000/Penumpang");
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
