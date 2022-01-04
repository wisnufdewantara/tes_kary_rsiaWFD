/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anorium.test1.controller;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Fauzi-EDP
 */
@ManagedBean
@ViewScoped
public class Soal2Controller{
    
    @PostConstruct
    public void init() {
         soal2 = new StringBuilder()
                .append("Pertanyaan :\n ")
                .append("Benahi program dengan ketentuan sebagai berikut:\n")
                .append("1. program hitung keliling ketika di klik akan menampilkan hasil di text hasil keliling\n")
                .append("2. program luas segitiga ketika di klik akan menampilkan hasil di text hasil luas")
                .toString();
        panjang = 0;
        lebar = 0;
        keliling = 0;
        alas=0;
        tinggi=0;
        luas=0;
    }
    private String soal2;
    private int panjang;
    private int lebar;
    private int keliling;
    private int alas;
    private int tinggi;
    private int luas;

    public String getSoal2() {
        return soal2;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getKeliling() {
        return keliling;
    }

    public void setKeliling(int keliling) {
        this.keliling = keliling;
    }
 
    public void hitungKeliling(){
        //buat rumus hitung keliling = panjang * lebar 
        //hint pastikan type string harus diubah dulu ke integer
        // pak mau tanya, yang benar keliling atau luas ya? kalau luas diganti aja rumusnya dibawah
        keliling = panjang + lebar + panjang + lebar;
        //keliling = panjang * lebar; 
    }
    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getAlas() {
        return alas;
    }    

    public int getTinggi() {
        return tinggi;
    }

    public int getLuas() {
        return luas;
    }
    public void setLuas(int luas) {
        this.luas = luas;
    }
    
    public void hitungLuas(){
        //buat rumus luas = 1/2 * alas * tinggi
        //hint gunakan variabel angka yang dapat menerima nilai desimal
        luas = alas *1/2 * tinggi;
    }
}
