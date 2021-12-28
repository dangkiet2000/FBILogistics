package com.example.demoapp.model;

import java.io.Serializable;

public class Log implements Serializable {
    private String stt;
    private String tenhang;
    private String hscode;
    private String congdung;
    private String hinhanh;
    private String cangdi;
    private String cangden;
    private String loaihang;
    private String soluongcuthe;
    private String yeucaudacbiet;
    private String valid;
    private String month;
    private String importorexport;

    public Log(String stt, String tenhang, String hscode, String congdung, String hinhanh,
               String cangdi, String cangden, String loaihang, String soluongcuthe,
               String yeucaudacbiet, String valid, String month, String importorexport) {
        this.stt = stt;
        this.tenhang = tenhang;
        this.hscode = hscode;
        this.congdung = congdung;
        this.hinhanh = hinhanh;
        this.cangdi = cangdi;
        this.cangden = cangden;
        this.loaihang = loaihang;
        this.soluongcuthe = soluongcuthe;
        this.yeucaudacbiet = yeucaudacbiet;
        this.valid = valid;
        this.month = month;
        this.importorexport = importorexport;
    }



    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getImportorexport() {
        return importorexport;
    }

    public void setImportAndExport(String importAndExport) {
        this.importorexport = importAndExport;
    }

    public String getCongdung() {
        return congdung;
    }

    public void setCongdung(String congdung) {
        this.congdung = congdung;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public String getHscode() {
        return hscode;
    }

    public void setHscode(String hscode) {
        this.hscode = hscode;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getCangdi() {
        return cangdi;
    }

    public void setCangdi(String cangdi) {
        this.cangdi = cangdi;
    }

    public String getCangden() {
        return cangden;
    }

    public void setCangden(String cangden) {
        this.cangden = cangden;
    }

    public String getLoaihang() {
        return loaihang;
    }

    public void setLoaihang(String loaihang) {
        this.loaihang = loaihang;
    }

    public String getSoluongcuthe() {
        return soluongcuthe;
    }

    public void setSoluongcuthe(String soluongcuthe) {
        this.soluongcuthe = soluongcuthe;
    }

    public String getYeucaudacbiet() {
        return yeucaudacbiet;
    }

    public void setYeucaudacbiet(String yeucaudacbiet) {
        this.yeucaudacbiet = yeucaudacbiet;
    }
}
