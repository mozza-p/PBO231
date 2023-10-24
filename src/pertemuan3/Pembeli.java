package pertemuan3;

public class Pembeli {
    //constructor melakukan set nilai(default) di awal
    //ada tiga jenis constructor: constructor 1 bisa bernilai null, constructor 2 ada 1 parameter,
   // constructor 3 ada 2 parameter dengan nilai berbeda
        //atribut (berisi semua kebutuhan kelas)
        /* member:
            nama, umur, nomor telfon, alamat
            dapat poin setiap :
            min belanja 50rb ---> poin 10
            min belanja 100rb ---> poin 20
         */
        /*
            non member:
            nama barang, jumlah, total, struk
         */
        private String namaPembeli, alamat, namaBarang, noTelp;
        private int usia, jumlah, total, poin, harga;
        //constructor (public nama class)
        //jumlah parameter tdk perlu dipermasalahkan
        // Cons Member
        public Pembeli(String nama, String alamat, int usia,
                       String telp){
            namaPembeli = nama;
            this.alamat = alamat;
            this.usia = usia;
            noTelp = telp;

        }
        //Cons Non Member == transaksi
        public Pembeli(String namaBrg, int jml, int harga){
            namaBarang= namaBrg;
            jumlah = jml;
            this.harga = harga;
        }
        //method
        //getter
        public String getNamaPembeli(){
            return this.namaPembeli;
        }
        public String getNamaBarang() {
             return namaBarang;
         }
        public String getAlamat() {
            return this.alamat;
        }
        public String getNoTelp(){
            return this.noTelp;
        }
        public int getUsia(){
            return this.usia;
        }
        public int getJumlah() {
            return this.jumlah;
        }
        public int getHarga(){
            return this.harga;
        }
        //method tambahan
        /*dapat poin setiap :
            min belanja 50rb ---> poin 10
            min belanja 100rb ---> poin 20
         */
        public int getTotal(){
            return getJumlah() * getHarga();
        }
        public int getMemberPoin(){
            poin = 0;
            if (getTotal() >= 50000){
                poin = 10;
            } else if (getTotal() >= 100000){
                poin = 20;
            }
            return poin;
        }
}


