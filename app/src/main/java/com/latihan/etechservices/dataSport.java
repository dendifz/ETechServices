package com.latihan.etechservices;

import java.util.ArrayList;

public class dataSport {
    private static String[] akse = {"bola","sarung tangan","sepatu basket","raket badminton","sepatu sepakbola",};
    private static String[] deskripsi = {"bagus","untuk kiper,original","sepatu original, ringan","raket badminton,enteng"
    ,"sepatu ori,nyaman digunakan"};
    private static int[] imageSport = {R.drawable.bola,R.drawable.sarung,R.drawable.sepatubasket,R.drawable.raket,
            R.drawable.sepatu};

    static ArrayList<aksesoris> getlistdata(){
        ArrayList<aksesoris>list = new ArrayList<>();
        for (int postion = 0;postion < akse.length;postion++){
            aksesoris Aksesoris = new aksesoris();
            Aksesoris.setName(akse[postion]);
            Aksesoris.setDes(deskripsi[postion]);
            Aksesoris.setImage(imageSport[postion]);
            list.add(Aksesoris);
        }
        return list;

    }
}
