package pertemuan4;

public class Tiket {
    private String nama, noTelp, nmHotel, nmPesawat, tujuan;
    private int jmlPenumpang, hrgPesawat, jumlahKamar, hargaKamar;
    private double diskon, totalHotel, totalPesawat;
        public Tiket(String nama, String telp, String tujuan, String nmHotel, int jmlKamar,
                     int hrgKamar, String nmPesawat, int jmlPenumpang, int hrgPesawat) {
        this.nama = nama;
        noTelp = telp;
        this.tujuan = tujuan;
        jumlahKamar = jmlKamar;
        hargaKamar = hrgKamar;
        this.nmHotel = nmHotel;
        this.nmPesawat = nmPesawat;
        this.jmlPenumpang = jmlPenumpang;
        this.hrgPesawat = hrgPesawat;
        }
        public String getNama(){return this.nama;}
        public String getTelp(){
        return this.noTelp;
        }
        public String getNmHotel(){
        return this.nmHotel;
        }
         public double getjmlKamar(){return this.jumlahKamar;}
        public double getHrgKamar(){
        return this.hargaKamar;
        }
        public String getnmPesawat(){return this.nmPesawat;}
        public int getjmlPenumpang(){
        return this.jmlPenumpang;
         }
        public int gethrgPesawat(){
        return this.hrgPesawat;
        }
        public String getTujuan(){return this.tujuan;}

        public double getTotalPesawat(){return (gethrgPesawat() * getjmlPenumpang()) + (getjmlPenumpang() * 29000);}
        public double getDiskon(){return getHrgKamar() * 0.45;}
        public double getTotalHotel(){return(getHrgKamar() - getDiskon()) * getjmlKamar();}


}

