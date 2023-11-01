package prakPertemuan4;

public class persegiPanjang {
    //atribut
    private int panjang, lebar;
    //constructor
    public persegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    //setter(inputan)
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    //getter(manggil inputan setter)
    public int getPanjang() {
        return panjang;
    }
    public int getLebar() {
        return lebar;
    }
    //method tambahan
    public double luasPersegiPanjang(){
        return getPanjang() * getLebar();
    }
}
