package com.hapsari.dramakorea;

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
            "The Heirs (2013)",
            "Descendants Of The Sun (2016)",
            "While You Were Sleeping (2017)",
            "Strong Woman Do Bong Soon (2017)",
            "Goblin (2017)",
            "Legend Of The Blue Sea (2017)",
            "Gangnam Beauty (2018)",
            "Are You Human Too? (2018)",
            "Hotel De Luna (2019)"
    };


    public static String[] DeskripsiDrakor = {
            "The Heirs merupakan salah satu Drama Korea yang berkisah mengenai komedi romantis diantara pewaris sebuah perusahaan dengan seorang gadis dari kalangan biasa. Drama yang juga di produksi oleh DramaFever ini mampu menarik perhatian para penonton dengan tampilnya Lee Min Ho dan Park Shin Hye sebagai bintang utamanya",
            "Descendants Of The Sun adalah salah satu Drama Korea tahun 2016 yang dibintangi oleh Song Joong-ki, Soong Hye-kyo, Jin Goo dan Kim Jiwon yang menceritakan tentang kehidupan tentara dan medis. Drama ini disiarkan di televisi KBS2 dengan 16 episode",
            "While You Were Sleeping merupakan salah satu Drama Korea yang dibintangi oleh Lee Jong-suk, Bae Suzy dan Jung Hae in. Drama ini ditayangkan di SBS dengan sejumlah 32 episode. Drama ini menceritakan kisah seorang wanita yang dapat melihat peristiwa melalui mimpinya yang kemudian mimpi tersebut akan menjadi kenyataan",
            "Strong Woman Do Bong Soon adalah drama jTBC yang tayang pada tahun 2017. Drama bergenre supranatural dengan alur yang dilengkapi dengan cerita romantis dan penuh kekonyolan menjadi drama yang digemari para pecinta drama Korea. Drama ini menampilkan Park Bo Young sebagai pemeran wanita sementara pemain utama pria diperankan oleh Park Hyung Shik",
            "Goblin merupakan serial Drama Korea yang tayang di TV kabel tVn pada tahun 2017. Drama ini menceritakan mengenai seorang pria bernama Kim Shin yang merupakan sosok goblin atau peri yang ditugaskan sebagai peri pelindung nyawa. Kim SHin tinggal dengan malaikat maut yang tengah menderita amnesia bernama Wang Yeo.",
            "Legend Of The Blue Sea adalah serial drama Korea yang tayang pada tahun 2017. Drama ini dibintangi oleh aktor Lee Min Ho dan aktris Jun Ji Hyun. Drama ini berlatarkan zaman Joseon dan zaman masa kini, dimana Jun Ji Hyun berperan sebagai putri duyung dan aktor Lee Min Ho berperan sebagai lelaki licik",
            "Gangnam Beauty merupakan salah satu serial drama Korea yang tayang pada tahun 2018 lalu. Drama ini dibintangi oleh Cha Eun wo yang merupakan anggota dari Boyband ASTRO dan Jo Woori. Drama ini menceritakan kehidupan kampus dimana Jo Woori berperan sebagai gadis yang melakukan operasi plastik demi memperbaiki kehidupannya di masa lalu.",
            "Are You Human Too merupakan salah satu serial Drama Korea yang tayang pada tahun 2018 lalu dengan diperankan oleh Seo Kang Joon dan Gang Seung yeon. Drama ini tayang di sebuah stasiun televisi korea KBS2. Drama ini menceritakan tentang sebuah robot bernama Namshin III yang merupakan tiruan dari seorang konglomerat kaya raya yang sedang koma.",
            "Hotel De Luna adalah salah satu serial drama korea yang dibintangi oleh penyanyi terkenal Korea Selatan IU dan aktor terkenal Yeo Jin Go. Drama ini tayang di stasiun tv korea tVn. Drama ini menceritakan seorang wanita yang hidup beberapa ribu yang lalu. Wanita ini mempunyai hotel yang diberi nama Hotel De Luna."
    };

    private static int[] FotoDrakor = {
            R.drawable.theheirs,
            R.drawable.dots,
            R.drawable.wyws,
            R.drawable.strong,
            R.drawable.goblin,
            R.drawable.legend,
            R.drawable.gangnam2,
            R.drawable.human,
            R.drawable.hotel
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
