package prakPertemuan4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BangunRuang {
    public static void main (String[] args) throws IOException {
        int sisi, alas, tinggi,r;
        double phi;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Segitiga s = new Segitiga (0, 0, 0);
        Kerucut k = new Kerucut(0, 0, 0, 0, 0);
        System.out.println("INPUT ANGKA");
        System.out.println("Masukkan Sisi: ");
        sisi = Integer.parseInt(br.readLine());
        System.out.println("Masukkan Alas: ");
        alas = Integer.parseInt(br.readLine());
        System.out.println("Masukkan Tinggi: ");
        tinggi = Integer.parseInt(br.readLine());
        System.out.println("Masukkan Jari-Jari: ");
        r = Integer.parseInt(br.readLine());
        System.out.println("Masukkan Phi: ");
        phi = Double.parseDouble(br.readLine());
        s = new Segitiga(sisi, alas, tinggi);
        k = new Kerucut(sisi, alas, tinggi, r, phi);
        System.out.println("Keliling Segitiga: " +s.kelilingSegitiga());
        System.out.println("Luas Segitiga: " +s.luasSegitiga());
        System.out.println("Volume Kerucut: " +k.getVolKerucut());
    }
}
