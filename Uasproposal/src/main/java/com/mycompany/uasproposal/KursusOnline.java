/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uasproposal;

/**
 *
 * @author Acer
 */
public class KursusOnline extends Kursus {
    private String platform;

    public KursusOnline(String nama, int harga, String platform) {
        super(nama, harga);
        this.platform = platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Platform: " + platform);
    }
}

    

