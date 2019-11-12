package com.hapsari.mysubmission;

public class FoodData {
    private static String[] foodNames ={
            "Bakso",
            "Mie Ayam",
            "Sate",
            "Pecel",
            "Nasi Goreng",
            "Ayam Goreng",
            "Rawon",
            "Rendang",
            "Mie Goreng"
    };

    private static String[] foodDetails ={
            "Makanan terbuat dari daging sapi berbentuk bulat",
            "Makanan terbuat dari daging sapi berbentuk bulat",
            "Makanan terbuat dari daging sapi berbentuk bulat",
            "Makanan terbuat dari daging sapi berbentuk bulat",
            "Makanan terbuat dari daging sapi berbentuk bulat",
            "Makanan terbuat dari daging sapi berbentuk bulat",
            "Makanan terbuat dari daging sapi berbentuk bulat",
            "Makanan terbuat dari daging sapi berbentuk bulat",
            "Makanan terbuat dari daging sapi berbentuk bulat",
            "Makanan terbuat dari daging sapi berbentuk bulat",
    };

    private static int[] foodImages ={
            R.drawable.bakso;
            R.drawable.mie_ayam;
            R.drawable.sate;
            R.drawable.pecel;
            R.drawable.nasi_goreng;
            R.drawable.ayam_goreng;
            R.drawable.rawon;
            R.drawable.rendang;
            R.drawable.mie_goreng;
    };

    static ArrayList<Food> getListData(){
        ArrayList<Food> list = new ArrauList<>();
        for (int position = 0; position < foodNames.length; position++){
            Food foof = new Food();
            food.setName(foodNames[position]);
            food.setDetail(foodDetails[position]);
            food.setPhoto(foodImages[position]);
            list.add(food);
        }
        return list;
        }
        }
