/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uasproposal;

/**
 *
 * @author Acer
 */
public class Kursus {
    private String nama;
    private int harga;

    public Kursus(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void informasi() {
        System.out.println("Nama Kursus: " + nama);
        System.out.println("Harga: " + harga + " USD");
    }
}

    

