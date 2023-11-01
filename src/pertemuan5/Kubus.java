package pertemuan5;

public class Kubus extends Persegi {
    public Kubus(int sisi) {
        super(sisi);
    }
    public int getLPKubus () {return 6 * getSisi();}
    public int getVolKubus() {return getSisi() * getSisi() * getSisi(); }

}
