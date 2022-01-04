/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anorium.test1.controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Fauzi-EDP
 */
@ManagedBean
@ViewScoped
public class Soal1Controller{
    
    @PostConstruct
    public void init() {
        soal1 = new StringBuilder()
                .append("Pertanyaan :\n ")
                .append("Buat form seperti dibawah dengan ketentuan sebagai berikut:\n")
                .append("1. form yang menampilkan dalam format Uppercase dengan judul Uppercase Text\n")
                .append("2. form yang menampilkan dalam format lowercase dengan judul Lowercase Text")
                .toString();
    }
    
    private String soal1;    
    private String text1;
    private String hasilText1;
    
    //tips -> untuk generate get dan set di netbeans, tekan alt+Insert => pilih Getter, Setter, atau keduanya

    public String getSoal1() {
        return soal1;
    }

    public void setSoal1(String soal1) {
        this.soal1 = soal1;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getHasilText1() {
        return hasilText1;
    }

    public void setHasilText1(String hasilText1) {
        this.hasilText1 = hasilText1;
    }

    public void tampilkanText(){
        //untuk contoh
        hasilText1 = text1;
    }
    
    public void tampilkanTextUpper(){
        //untuk contoh
        hasilText1 = text1.toUpperCase();
    }

    public void tampilkanTextLower(){
        //untuk contoh
        hasilText2 = text1.toLowerCase();
    }
    private String text2;
    private String hasilText2;

    public String getText2() {
        return text2;
    }

    public String getHasilText2() {
        return hasilText2;
    }
    
    public void tampilkanUpperText(){
        
    }

}
