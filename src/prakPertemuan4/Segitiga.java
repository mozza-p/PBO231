package prakPertemuan4;

public class Segitiga {
    private int sisi, alas, tinggi;
    public Segitiga(int sisi, int alas, int tinggi){
        this.sisi = sisi;
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    public void setAlas(int alas) {
        this.alas = alas;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    public int getSisi() {
        return sisi;
    }
    public int getAlas() {
        return alas;
    }
    public int getTinggi() {
        return tinggi;
    }
    public double kelilingSegitiga(){
        return getSisi() * getSisi() * getSisi();
    }
    public double luasSegitiga(){
        return 0.5 * getAlas() * getTinggi();
    }
}
