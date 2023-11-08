package pertemuan6;
//polimorphism 1//
//hanya butuh satu kelas//
public class Persegi {
    //luas persegi: sisi x sisi
    private int sisi;

    public int getSisi() {
        return sisi;
    }
    /*overloading method
    syaratnya: jumlah parameter berbeda*/
    public int getLuas(){ //nilai sisi default
        return 4*4;
    }
    //inputan user
    //karena nama getter sama maka harus dikasi parameter
    public int getLuas(int s){
        int luas = s * s;
        return luas;
    }
    //contoh di atas masuk static polymorphism
    /*overriding--> ada sub class karena sifatnya
    pewarisan / inheritance*/
    public void cetakLuas(){
        System.out.println("Luas persegi sesuai inputan user adalah " +getLuas());
    }
}
