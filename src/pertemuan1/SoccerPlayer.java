package pertemuan1;

public class SoccerPlayer extends contoh {
    //untuk mengambil item-item dari class contoh, bisa dengan melakukan
    //Instance of class = objek (membuat objek dari class contoh ke class SoccerPlayer)
    //atribut/variabel hanya bisa diambil di main class

    contoh c = new contoh(); //Instance of class (mengambil setter, getter,dll. / jembatan)
    public void ambilSetDariContoh() {
        //super ada di konsep inheritance, gunanya untuk ambil fungsi di class induk
        super.setName("Nama");


    }

}
