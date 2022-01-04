/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anorium.test1.controller;

import com.anorium.test1.model.Karyawan;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
public class Soal5Controller implements Serializable {
    // buat full program dengan seperti pada soal ke 4. apabila data yang dimasukkan sudah ada, maka data tidak akan tersimpan
    //        isi tabel : 
//        nik,nama,alamat    
//        123123,Ahmad Khumaini,Jl. Alpa
//        123124,Asiri Aziz,Jl. Beta
//        123125,Samsudin Sah,Jl. Charlie
//        123126,Reni Nur Farida,Jl. Delta
//        123127,Siti Fatimah,Jl. Echo
//        123128,Indah Lestari,Jl. Foxtrot
//        123129,Ani Nurhayati,Jl. Gamma
    
    @PostConstruct
    public void init() {      
    }

    
}
