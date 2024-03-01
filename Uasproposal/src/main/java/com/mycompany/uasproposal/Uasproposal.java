/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uasproposal;

/**
 *
 * @author Acer
 */
public class Uasproposal {

    public static void main(String[] args) {
        KursusOnline kursusOnline = new KursusOnline("Java Programming", 100, "Udemy");
        KursusOffline kursusOffline = new KursusOffline("Python for Beginners", 150, "Jakarta");

        System.out.println("Informasi Kursus Online:");
        kursusOnline.informasi();

        System.out.println("\nInformasi Kursus Offline:");
        kursusOffline.informasi();
    }
}



    
      
    

