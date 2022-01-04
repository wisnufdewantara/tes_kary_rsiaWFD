/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anorium.test1.controller;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Fauzi-EDP
 */
@ManagedBean
@ViewScoped
public class Soal3Controller {
    
    @PostConstruct
    public void init() {
        soal3 = new StringBuilder()
                .append("Pertanyaan :\n ")
                .append("Benahi program dengan ketentuan sebagai berikut:\n")
                .append("1. program looping text ketika di klik akan menampilkan text bebas sebanyak x kali sesuai jumlah text yang diinput\n")
                .append(" misal text bebas = 'RSI' , jumlah text = '3'\n")
                .append(" maka hasil text adalah = 'RSI RSI RSI'")
                .toString();
         
        hasilText1 = jumlahText;
    }
    
    private String soal3;
    private String text1;
    private String jumlahText;
    private String hasilText1;

    public String getSoal3() {
        return soal3;
    }

    public String getText1() {
        return text1;
    }

    public String getJumlahText() {
        return jumlahText;
    }

    public String getHasilText1() {
        return hasilText1;
    }
    
    public void tampilkanText(){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sukses ","Berhasil menduplikat text "+text1+" sebanyak "+jumlahText+" kali"));

    }
    
}
