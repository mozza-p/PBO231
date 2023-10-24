package pertemuan1;
//tahapan I/O
//1. import I/O(Scanner--> data primitif(char, int, double)/
    //BufferedReader--> jangkauan data yang lebih luas
//2. Error handling
//3. Objek dari library I/O
import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class tes {

    public static void main(String[] args) {
        //objek br
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //instance of class
        contoh c = new contoh();
        //error handling
        try {
            //blok kode dengan asumsi benar
            //berisi input,output
            System.out.println("---INPUT---");
            c.setName(br.readLine());
            c.setIpk(Double.valueOf(br.readLine()));
            //int --> c.setIPK(Integer.parseInt(br.readLine());
            //double --> c.setIPK(Integer.parseDouble(br.readLine());
        } catch (Exception ec) {
            //isinya mengikuti apa yang salah
            //blok kode untuk menjalankan info kesalahan dari blok try
            System.out.println(ec.getMessage());
        }
    }
}
