package pertemuan3;

import java.io.*;
public class MainClassPembeli {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    /*
    1. Pendaftaran Member
    2. Transaksi pembelian barang
        - Punya member / tidak
        - Jika member (telp),cek no telpnya sama /tidak
           dengan yang sudah didaftarkan
        - Jika tidak member, hanya proses transaksi biasa
     */
        Pembeli member = new Pembeli("", "", 0, "");
        Pembeli transaksi = new Pembeli("", 0, 0);
        //const = perlu deklarasi ulang variabel
        String namaBrg, namaPembeli, alamat, telp;
        int usia, jml, hrg;
        try {
            do {
                System.out.println("--MARET APRIL--");
                System.out.println("1. Pendaftaran Member");
                System.out.println("2. Transaksi");
                System.out.println("3. Keluar");
                System.out.println("Pilih menu:");
                int menu = Integer.parseInt(br.readLine());
                switch (menu) {
                    case 1:
                        //1. Pendaftaran member
                        System.out.println("--Daftar Member--");
                        System.out.println("Nama:");
                        namaPembeli = br.readLine();
                        System.out.println("Alamat:");
                        alamat = br.readLine();
                        System.out.println("No Telp:");
                        telp = br.readLine();
                        System.out.println("Usia:");
                        usia = Integer.parseInt(br.readLine());
                        member = new Pembeli(namaPembeli, alamat, usia, telp);
                        break;
                    case 2:
                        //2. Transaksi
                        System.out.println("--Transaksi--");
                        System.out.print("Nama barang: ");
                        namaBrg = br.readLine();
                        System.out.print("Jumlah barang: ");
                        jml = Integer.parseInt(br.readLine());
                        System.out.print("Harga barang: ");
                        hrg = Integer.parseInt(br.readLine());
                        // data disimpan dalam constructor
                        transaksi = new Pembeli(namaBrg, jml, hrg);
                        System.out.println("Total Pembelanjaan: " +transaksi.getTotal());
                        System.out.println("Member? (y/n)");
                        String jawab = br.readLine();
                        if (jawab.equalsIgnoreCase("y")){
                            System.out.print("Masukkan No Telp: ");
                            telp = br.readLine();
                            // dicek apa no telpnya sama dengan yang didaftarkan atau tidak
                            if (telp.equalsIgnoreCase(member.getNoTelp()));{
                                System.out.println("Nomor telepon yang didaftarkan: " + member.getNoTelp());
                                System.out.println("Jumlah poin yang didapatkan: " + transaksi.getMemberPoin());
                            } 
                            //Transaksi dilakukan
                            //Proses input barang
                        } else {
                            System.out.println("Mohon maaf nomor telepon Anda tidak terdaftar");
                        }
                        break;
                    default:
                        //keluar program
                        System.exit(menu);

                }

            } while (true);
        } catch (Exception ec) {
            System.out.println(ec.getMessage());
        }
    }
}
