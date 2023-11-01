package prakPertemuan4;

public class Balok extends persegiPanjang {
    //atribut
    private int tinggi;
   //constructor
    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    public int getTinggi() {
        return tinggi;
    }
    //diambil dari super karena ambil dari class induknya
    public double getLuasBalok() {
        return 2 * ((super.getPanjang() * super.getLebar()) + (super.getPanjang()) * getTinggi())
                + (super.getLebar() * getTinggi());
    }
    public double getVolBalok(){
        return super.getPanjang() * super.getLebar() * getTinggi();
    }
    @Override
    public int getPanjang() {
        return super.getPanjang();
    }
    @Override
    public int getLebar() {
        return super.getLebar();
    }
}
