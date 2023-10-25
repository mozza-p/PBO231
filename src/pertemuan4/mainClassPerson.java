package pertemuan4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class mainClassPerson {
    public static void main (String[] args){
        //cara instance of class
        //objeknya adalah subclass
        //berarti objek main class ini (cust, emp)
        //parameter diisi nilai default, INGAT URUTANNYA!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Customer c = new Customer("", "","");
        Employee e = new Employee("","","", "", "");
        try {
            do{
                System.out.println("--MENU INPUT DATA PERSON--");
                System.out.println("1. Input Data Customer");
                System.out.println("2. Input Data Employee");
                System.out.println("3. Lihat Data Customer");
                System.out.println("4. Lihat Data Employee");
                System.out.println("5. Keluar");
                System.out.println("Pilih Menu (1-5):");
                int menu = Integer.parseInt(br.readLine());
                switch(menu){
                    case 1:
                        System.out.println("Nama Customer: ");
                        String n = br.readLine();
                        System.out.println("Alamat Customer: ");
                        String a = br.readLine();
                        System.out.println("Kode Customer: ");
                        int kd_cust = Integer.parseInt(br.readLine());
                }
            }while(true);
        }catch (Exception ec){
            System.out.println(ec.getMessage());
        }
    }

}
