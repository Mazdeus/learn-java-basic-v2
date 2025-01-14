package com.dicoding.javafundamental.basic;

/* import com.dicoding.javafundamental.basic.kendaraan.Kereta;
import com.dicoding.javafundamental.basic.kendaraan.Mobil;
import com.dicoding.javafundamental.basic.kendaraan.Motor;
import com.dicoding.javafundamental.basic.musik.Gitar; KTA SEDERHANAKAN MENJADI */

import com.dicoding.javafundamental.basic.kendaraan.*; //Penggunaan wildcard (*) kadang tidak disarankan jika class di dalam package tersebut terlalu banyak.Untuk itu kita serahkan ke IntelliJ mengatur import yang optimal. Pilih menu Code | Optimize Imports. Baris import akan kembali ke sebelumnya tanpa menggunakan wildcard (*).
import com.dicoding.javafundamental.basic.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello World!");

        Gitar.bunyi(); //perlu importclassGitar agar dikenali. Pindahkan kursor ke baris kode yang ditandai dengan error tersebut, lalu tekan alt + Enter(Windows) atau option + return(MacOS).

        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();

        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tomorrow);
    }
}
