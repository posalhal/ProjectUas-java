/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uasproposal;

/**
 *
 * @author Acer
 */

    

public class KursusOffline extends Kursus {
    private String lokasi;

    public KursusOffline(String nama, int harga, String lokasi) {
        super(nama, harga);
        this.lokasi = lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getLokasi() {
        return lokasi;
    }

    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Lokasi: " + lokasi);
    }
}
