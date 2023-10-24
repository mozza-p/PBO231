package pertemuan2;

public class contoh2 {
    //utk tipe data selain string, bisa diketik tanpa kapital diawal
    //membuat program untuk menghitung nilai akhir dari NA PBO
    //NA = (uts*20) + (uas*25%) + (tugas*55%)
    /*
    NIM:
    Nama:
    Prodi:
    MK:
    NA:
     */
    //lakukan analisis terlebih dahulu, bagian mana yang membutuhkan input
    public String nim, nama, prodi, mk;
    public int uts, uas, tugas, na;
    //operasi
    //bisa diisi setter, untuk output tidak perlu jadi setter
    //untuk simpan data user yang sdh diinput
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setProdi(String prodi){
        this.prodi = prodi;
    }
    public void setMk(String mk){
        this.mk = mk;
    }
    public void setUts(int uts){
        this.uts = uts;
    }
    public void setUas(int uas) {
        this.uas = uas;
    }
    public void setTugas(int tgs) {
        tugas = tgs;
    }
    //getter
    //dipakai untuk semua data yang dideklar
    //tidak pakai na karena hasil na berbentuk output
    public String getNim() {return nim;}
    public String getNama() {
        return nama;
    }
    public String getProdi() {
        return prodi;
    }
    public String getMk() {
        return mk;
    }
    public int getUts() {
        return uts;
    }
    public int getUas() {
        return uas;
    }
    public int getTugas() {
        return tugas;
    }
    //custom method
    //memanggil get bukan bagian yg diinput di awal
    public int getNa(){
        na = (getUts()*20/100) + (getUas()*25/100) + (getTugas()*55/100);
        return na;
    }
    //karena tidak ada nilai yang dikembalikan pada output, maka pakai setter
    public void cetakDataMhs(){
        System.out.println ("==Data Mahasiswa==");
        System.out.println("NIM: " +getNim() + "\n" +
                "Nama: " +getNama() + "\n" +
                "Prodi: " +getProdi() + "\n" +
                "Mata Kuliah: " +getMk() + "\n" +
                "UTS: " +getUts() + "\n" +
                "UAS: " +getUas() + "\n" +
                "Tugas: " +getTugas() + "\n" +
                "NA: " +getNa() + "\n"
        );
    }
}
