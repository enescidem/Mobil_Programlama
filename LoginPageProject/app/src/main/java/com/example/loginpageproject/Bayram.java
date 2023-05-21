package com.example.loginpageproject;

public class Bayram {
    private int resim;
    private String bayram,bayramAciklama;

    public Bayram(int resim, String bayram, String bayramAciklama) {
        this.resim = resim;
        this.bayram = bayram;
        this.bayramAciklama = bayramAciklama;
    }

    public int getResim() {
        return resim;
    }

    public void setResim(int resim) {
        this.resim = resim;
    }

    public String getBayram() {
        return bayram;
    }

    public void setBayram(String bayram) {
        this.bayram = bayram;
    }

    public String getBayramAciklama() {
        return bayramAciklama;
    }

    public void setBayramAciklama(String bayramAciklama) {
        this.bayramAciklama = bayramAciklama;
    }
}
