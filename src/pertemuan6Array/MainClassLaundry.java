package pertemuan6Array;

import pertemuan6.Laundry;
import pertemuan6.transaksiLaundry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MainClassLaundry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CRUD crud = new CRUD();
        do {
            System.out.println("Laundry Ajja");
            System.out.println("1. Menu Master");
            System.out.println("2. Menu Transaksi");
            System.out.println("3. Menu Cari Data");
            System.out.println("4. Menu Keluar");
            System.out.println("Masukkan pilihan menu: ");
            int menu = Integer.parseInt(br.readLine());
            switch (menu) {
                case 1:
                    crud.insertMasterData();
                    System.out.println();
                    break;
                case 2:
                    crud.insertTransaksi();
                    crud.cetakData();
                    System.out.println();
                    break;
                case 3:
                    crud.cariData();
                    break;
                default:
                    System.exit(0);
            }
        } while (true);
    }
}
