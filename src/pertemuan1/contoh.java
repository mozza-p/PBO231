package pertemuan1;

public class contoh { //identitas
    //poin pertama tidak menyebutkan fungsi
    //atribut = variabel
    //private(hanya bisa dibaca di satu kelas/kelas itu sendiri)/protected(bisa dibaca di class, package, dan subclass)
    private String name;
    private Double ipk;

    //operasi/fungsi
    //setter(prosedur), harus menggunakan void
    public void setName(String name) {
        //jika nama atribut pada class = nama atribut pada parameter setter/getter, beri keyword this
        this.name = name;
    }
    //getter = fungsi --> tanpa parameter , harus ada return, menggunakan tipe data
    public String getName(){
        return this.name;
    }
    public void setIpk(Double ipk){
        this.ipk = ipk;
    }
    public Double getIpk(){
        return this.ipk;
    }
    //custom method --> fungsi2 lain



}
