package com.hapsari.hmjpolines;

import java.util.ArrayList;

public class HmjData {

    public static String[][] data = new String[][]{
            {"0","HMJ Elektro","Himpunan Mahasiswa Elektro terdiri dari 5 Program Studi, yaitu D3 Teknik Informatika, D3 Elektronika, D3 Listrik, D3 Telekomunikasi dan D4 Telekomunikasi","https://i.postimg.cc/QxdcLRBk/hme.jpg"},
            {"1","HMJ Sipil","Himpunan Mahasiswa Elektro terdiri dari 5 Program Studi, yaitu D3 Teknik Informatika, D3 Elektronika, D3 Listrik, D3 Telekomunikasi dan D4 Telekomunikasi","https://i.postimg.cc/yxBXSxYw/hms.jpg"},
            {"2","HMJ Mesin","Himpunan Mahasiswa Elektro terdiri dari 5 Program Studi, yaitu D3 Teknik Informatika, D3 Elektronika, D3 Listrik, D3 Telekomunikasi dan D4 Telekomunikasi","https://i.postimg.cc/LsL1BS7R/hmm.jpg"},
            {"3","HMJ Akuntansi","Himpunan Mahasiswa Elektro terdiri dari 5 Program Studi, yaitu D3 Teknik Informatika, D3 Elektronika, D3 Listrik, D3 Telekomunikasi dan D4 Telekomunikasi","https://i.postimg.cc/3NS4Jxyj/hmak.jpg"},
            {"4","HMJ Administrasi Bisnis","Himpunan Mahasiswa Elektro terdiri dari 5 Program StuCha Eni, yaitu D3 Teknik Informatika, D3 Elektronika, D3 Listrik, D3 Telekomunikasi dan D4 Telekomunikasi","https://i.postimg.cc/pLYvD1Z4/hmab.jpg"}
    };

    public static ArrayList<Hmj> getListData(){
        ArrayList<Hmj> list = new ArrayList<>();
        for (String[] aData : data){
            Hmj hmj = new Hmj();
            hmj.setId(Integer.parseInt(aData[0]));
            hmj.setName(aData[1]);
            hmj.setDescription(aData[2]);
            hmj.setPhoto(aData[3]);

            list.add(hmj);
        }
        return list;
    }
}
