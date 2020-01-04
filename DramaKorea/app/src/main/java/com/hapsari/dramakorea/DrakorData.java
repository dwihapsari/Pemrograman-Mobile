package com.hapsari.dramakorea;

import android.graphics.drawable.RippleDrawable;

import java.util.ArrayList;

public class DrakorData {
    private static int[] IdMakanan = {
            0,
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
    };

    public static String[] NamaDrakor = {
            "Gudeg",
            "Krecek",
            "Bakpia Pathok",
            "Yangko",
            "Cilok Gajahan",
            "Cenil",
            "Sate Klatak",
            "Jadah Tempe Mbah Carik",
            "Sate Kelinci Mbah Ganis",
            "Enthog Slenget Kang Tanir"
    };


    public static String[] DeskripsiDrakor = {
           "Makanan khas yogyakarta yang terkenal ini tentunya sudah akrab di telinga anda. Hampir setiap pengunjung yang datang ke jogja pasti akan mendatangi rumah makan yang menjual gudeg. Sentra wisata kuliner gudeg di jogja yang paling terkenal berada di sekitaran dekat kampus UGM dan juga sekitar plengkung kraton dekat alun-alun kidul. Gudeg jogja ada tiga jenis, yaitu basah, manggar, dan kering. Bagi anda yang ingin membawa gudeg sebagai oleh oleh, disarankan untuk membeli gudeg kering saja agar tahan lama.",
            "Makanan khas jogja selain gudeg adalah sambal krecek yang banyak disukai orang. Sambal krecek biasanya disajikan bersama dengan gudeg manis sehingga dapat menambah selera makan anda. Rasa sambal krecek sendiri dominan pedas dan gurih.",
            "Bila anda berada di jogja, jangan bingung untuk membeli oleh oleh makanan khas jogja. Sebut saja bakpia pathuk, maka anda akan dibawa ke sekitar jalan mataram dekat malioboro yang merupakan sentra penjualan bakpia pathuk. Anda dapat memilih bakpia pathuk beraneka merk dan rasa di jalan ini. Tekstur kue yang berasal dari campuran kacang hijau dan gula yang dibalut dengan kulit tepung kemudian dipanggang ini sungguh sangat memanjakan lidah. Bakpia pathuk, krispi diluar namun lembut di dalam.",
            "Ketika anda mampir ke jalan mataram sembari membeli bakpia atau ke toko oleh-oleh di wilayah jogja, jangan lupa dengan makanan khas jogja yangko ini. Yangko biasanya berbentuk persegi dengan warna-warna yang cerah sesuai dengan rasanya. Teksturnya lembut, kenyal, dan manis karena terdapat taburan tepung khusus sebagai ciri khas dari kue yangko.",
            "Makanan ini cukup terkenal dan fenomenal. Bahkan sekarang sudah buka cabang dari yang tadinya hanya dijual memakai gerobak di sekitar alun-alun kidul, sekarang sudah membuka cabang di daerah jalan kaliurang. Meskipun jajanan ini berasal dari jawa barat, namun cilok gajahan mampu menjadi primadona jajanan masyarakat jogja lintas usia.",
            "Jika anda mencari makanan ringan khas jogja, maka jawabannya adalah cenil. Meskipun di seantero pulau jawa cenil ini sudah terkenal dan bahkan di setiap daerah mempunyai kekhasan cenil masing-masing, namun tidak ada salahnya anda mencoba cenil khas jogja ini.",
            "Sate klatak masuk ke dalam daftar makanan khas jogja yang enak. Jika anda sedang berkunjung ke daerah Jejeran, Pleret, Bantul, maka anda wajib mencoba sate klathak ini. Keunikan dari sate klathak ini adalah potongan daging kambing muda yang ditusuk memakai jeruji, berbeda dari sate pada umumnya. Bumbu yang dipakai pun sedikit berbeda ditambah dengan siraman kuah gulai yang menggugah selera akan menambah selera makan anda.",
            "Berkunjung ke daerah utara jogja, maka anda harus mencoba makanan khas yogyakarta ini, jadah tempe mbah carik. Jadah merupakan makanan khas kabupaten sleman. Jadah terbuat dari ketan yang dicampur dengan kelapa dan memilik cita rasa gurih. Jadah biasanya disajikan bersama dengan tempe bacem manis. Anda dapat mendapatkan seporsi jadah tempe di warung jadah tempe mbah carik yang terletak di daerah hargobinangun, pakem.",
            "Sepeti namanya, sate kelinci berbahan dasar daging kelinci yang ditusuk menggunakan sebatang lidi kemudian dibakar. Sate kelinci mbah ganis memang baru buka pada malam hari, sangat cocok disantap di udara kaliurang yang dingin bersama dengan segelas teh hangat ataupun kopi.",
            "Satu lagi kuliner yang masuk dalam daftar makanan khas jogja yang enak, yaitu enthog slenget. Jika anda sedang berkunjung ke utara jogja tepatnya daerah Turi, maka anda wajib mencicipi kuliner yang satu ini. Satu porsi enthog slenget berisi daging enthog yang dimasak ala semur lengkap dengan cabai untuk menghasilkan rasa pedas. Di warung makan enthog slenget kang tanir, biasanya ditambah dengan merica bubuk agar rasa pedasnya lebih bertahan lama di mulut."
    };

    private static int[] FotoDrakor = {
            R.drawable.gudeg,
            R.drawable.krecek,
            R.drawable.bakpia,
            R.drawable.yangko,
            R.drawable.cilok,
            R.drawable.cenil,
            R.drawable.sateklatak,
            R.drawable.jadah,
            R.drawable.satekelinci,
            R.drawable.enthog
    };

    public static ArrayList<Drakor> getListData(){
        ArrayList<Drakor> list = new ArrayList<>();
        for(int position = 0; position < NamaDrakor.length; position++){
            Drakor drakor = new Drakor();
            drakor.setId(IdMakanan[position]);
            drakor.setName(NamaDrakor[position]);
            drakor.setDescription(DeskripsiDrakor[position]);
            drakor.setPhoto(FotoDrakor[position]);
            list.add(drakor);
        }
        return list;
    }


}
