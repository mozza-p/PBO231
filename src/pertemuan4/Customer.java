package pertemuan4;
//kelas turunan/ warisan dari kelas person namanya subclass atau anak class
//extends fungsinya untuk mengambil variabel dari kelas induk

public class Customer extends Person {
    private String kd_cust;
    //constructor
    public Customer(String n, String a, String kd_cust) {
        super(n, a);
        this.kd_cust = kd_cust;
    }
    public String getkdCust() {
        return kd_cust;
    }
    //override method
    @Override
    public String getNama() {
        return super.getNama();
    }
    @Override
    public String getAlamat() {
        return super.getAlamat();
    }

}
