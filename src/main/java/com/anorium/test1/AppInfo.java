/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anorium.test1;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Fauzi-EDP
 */
@Named(value = "appInfo")
@ApplicationScoped
public class AppInfo implements Serializable{
    
    @PostConstruct
    public void init() {
        namaAplikasi = AppConf.NAMA_APLIKASI;
        namaPeserta = AppConf.NAMA_PESERTA;
    }
    
    private String namaAplikasi;
    private String namaPeserta;

    public String getNamaAplikasi() {
        return namaAplikasi;
    }

    public void setNamaAplikasi(String namaAplikasi) {
        this.namaAplikasi = namaAplikasi;
    }

    public String getNamaPeserta() {
        return namaPeserta;
    }

    public void setNamaPeserta(String namaPeserta) {
        this.namaPeserta = namaPeserta;
    }
    
    public void save() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Kofigurasi sukses disimpan"));
    }
    
}
