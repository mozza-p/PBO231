package pert4latihan1;

public class subClass extends superClass {
    private int usia;
    //constructor
    public subClass(String nama, String ket, int usia) {
        super(nama, ket);
         this.usia = usia;
    }
    //getter
    public int getUsia(){return usia;}
    //override method
    @Override
    public String getNama() {
        return super.getNama();
    }
    @Override
    public String getKet() {
        return super.getKet();
    }
}
