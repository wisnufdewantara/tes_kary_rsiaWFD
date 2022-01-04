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
public class Soal4Controller implements Serializable {
    
    @PostConstruct
    public void init() {
        soal4 = new StringBuilder()
               .append("Pertanyaan :\n ")
               .append("Benahi program dengan ketentuan sebagai berikut:\n")
               .append("1. program menampilkan object ke dalam tabel untuk menampilkan data karyawan  yang sudah ditulis di nik,nama, dan alamat\n")
               .append("2. memasukkan banyak data ke dalam object sesua jumlah data yang dituli. misal Jumlah = 3, maka data dalam tabel akan terisi 3 nama yang sama\n")
               .append("3. menampilkan object dari list yang sudah ada, list ada di method tampilkanDataTabel ")
               .toString();
        
        karyawans = new ArrayList();
        nik1="";
        nama1="";
        alamat1="";
        

    }
    
    private String soal4;

    public String getSoal4() {
        return soal4;
    }
    
    private String nik1;
    private String nama1;
    private String alamat1;
    private List<Karyawan> karyawans;

    public String getNik1() {
        return nik1;
    }

    public void setNik1(String nik1) {
        this.nik1 = nik1;
    }

    public String getNama1() {
        return nama1;
    }

    public void setNama1(String nama1) {
        this.nama1 = nama1;
    }

    public String getAlamat1() {
        return alamat1;
    }

    public void setAlamat1(String alamat1) {
        this.alamat1 = alamat1;
    }

    public List<Karyawan> getKaryawans() {
        return karyawans;
    }

    public void setKaryawans(List<Karyawan> karyawans) {
        this.karyawans = karyawans;
    }
    
    public void tambahDataTabel(){
        Karyawan b = new Karyawan();
        b.setNik(nik1);
        karyawans.add(b);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sukses ","Berhasil memasukkan karyawan dengan nik:"+nik1));
    }
    
    public void hapusDataTabel(){
        karyawans.clear();
    }
    
    private String nik2;
    private String nama2;
    private String alamat2;
    private int jumlah2;
    private List<Karyawan> karyawans2;

    public String getNik2() {
        return nik2;
    }

    public String getNama2() {
        return nama2;
    }

    public String getAlamat2() {
        return alamat2;
    }

    public int getJumlah2() {
        return jumlah2;
    }

    public List<Karyawan> getKaryawans2() {
        return karyawans2;
    }

    public void tampilkanBanyakDataTabel(){
        //buat looping untuk memasukkan data yang tertulis
    }
    
    public void tampilkanDataTabel(){
        //buat looping untuk 
//        isi tabel : 
//        nik,nama,alamat    
//        123123,Ahmad Khumaini,Jl. Alpa
//        123124,Asiri Aziz,Jl. Beta
//        123125,Samsudin Sah,Jl. Charlie
//        123126,Reni Nur Farida,Jl. Delta
//        123127,Siti Fatimah,Jl. Echo
//        123128,Indah Lestari,Jl. Foxtrot
//        123129,Ani Nurhayati,Jl. Gamma

    }
    
    public void hapusBanyakDataTabel(){

    }
 
    public void hapusTabel(){

    }
    
}
