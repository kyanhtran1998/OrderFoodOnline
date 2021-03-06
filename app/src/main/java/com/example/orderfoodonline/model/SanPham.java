package com.example.orderfoodonline.model;


import java.io.Serializable;

public class SanPham implements Serializable {
    public int id;
    public String tensanpham;
    public int giasanpham;
    public String hinhanhsanpham;
    public String motasanpham;

    public int getTimestart() {
        return timestart;
    }

    public void setTimestart(int timestart) {
        this.timestart = timestart;
    }

    public int getTimeend() {
        return timeend;
    }

    public void setTimeend(int timeend) {
        this.timeend = timeend;
    }

    public int idsanpham;
    public int timestart;
    public int timeend;


    public SanPham(int id, String tensanpham, int giasanpham, String hinhanhsanpham, String motasanpham, int idsanpham, int timestart, int timeend) {
        this.id = id;
        this.tensanpham = tensanpham;
        this.giasanpham = giasanpham;
        this.hinhanhsanpham = hinhanhsanpham;
        this.motasanpham = motasanpham;
        this.idsanpham = idsanpham;
        this.timestart = timestart;
        this.timeend = timeend;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public int getGiasanpham() {
        return giasanpham;
    }

    public void setGiasanpham(int giasanpham) {
        this.giasanpham = giasanpham;
    }

    public String getHinhanhsanpham() {
        return hinhanhsanpham;
    }

    public void setHinhanhsanpham(String hinhanhsanpham) {
        this.hinhanhsanpham = hinhanhsanpham;
    }

    public String getMotasanpham() {
        return motasanpham;
    }

    public void setMotasanpham(String motasanpham) {
        this.motasanpham = motasanpham;
    }

    public int getIdsanpham() {
        return idsanpham;
    }

    public void setIdsanpham(int idsanpham) {
        this.idsanpham = idsanpham;
    }


    public SanPham() {

    }

    public SanPham(int id, String tensanpham, int giasanpham, String hinhanhsanpham, String motasanpham, int idsanpham) {
        this.id = id;
        this.tensanpham = tensanpham;
        this.giasanpham = giasanpham;
        this.hinhanhsanpham = hinhanhsanpham;
        this.motasanpham = motasanpham;
        this.idsanpham = idsanpham;

    }

}
