package pertemuan6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        //instance of class polymorphism: menyesuaikan
        //poly (overloading)ini ada di super class jadi bisa dijadikan instance of class
        //overriding gabungan dari poly dan inheritance
        //instance of class inheritance: sub class
        Persegi p = new Persegi();
        p.cetakLuas();
    }
}
