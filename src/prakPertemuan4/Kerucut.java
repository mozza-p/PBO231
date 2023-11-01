package prakPertemuan4;

public class Kerucut extends Segitiga{
    private int r;
    private double phi;
    public Kerucut (int sisi, int alas, int tinggi, int r, double phi){
        super(sisi,alas, tinggi);
        this.r = r;
        this.phi = phi;
    }
    public double getR(){
        return getR();
    }
    public double getPhi(){
        return getPhi();
    }
    public double getVolKerucut(){
        return (1.0/3.0) * getPhi() * getR() * getR() * getTinggi();
    }
    @Override
    public int getAlas() {
        return super.getAlas();
    }
    @Override
    public int getTinggi() {
        return super.getTinggi();
    }
}
