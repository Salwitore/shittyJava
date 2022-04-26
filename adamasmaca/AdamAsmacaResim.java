/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adamasmaca;

/**
 *
 * @author harun
 */
public class AdamAsmacaResim {
    private static int hak;

    public int getHak() {
        return hak;
    }

    public void setHak(int hak) {
        AdamAsmacaResim.hak = hak;
    }
   
    
    public void adamResim(int hak){
        
        
        if (hak == 10) {
            System.out.println("*              *");
            System.out.println("*              *");
            System.out.println("*              *");
            System.out.println("*              *");
            System.out.println("*              *");
            System.out.println("*              *");
            System.out.println("****************");
            System.out.println("Kelimeyi tahmin etmek için "+getHak()+" Adet hakkınız kaldı");
        }
        else if (hak == 9) {
            System.out.println("*              *");
            System.out.println("*              *");
            System.out.println("*              *");
            System.out.println("*              *");
            System.out.println("*              *");
            System.out.println("*_________     *");
            System.out.println("****************");
            System.out.println("Kelimeyi tahmin etmek için "+getHak()+ "Adet hakkınız kaldı");
        }
        else if (hak == 8) {
            System.out.println("*               *");
            System.out.println("*               *");
            System.out.println("*               *");
            System.out.println("*    |          *");
            System.out.println("*    |          *");
            System.out.println("*____|____      *");
            System.out.println("****************");
            System.out.println("Kelimeyi tahmin etmek için "+getHak()+ "Adet hakkınız kaldı");
        }
        else if (hak == 7) {
            System.out.println("*    |          *");
            System.out.println("*    |          *");
            System.out.println("*    |          *");
            System.out.println("*    |          *");
            System.out.println("*    |          *");
            System.out.println("*____|____      *");
            System.out.println("****************");
            System.out.println("Kelimeyi tahmin etmek için "+getHak()+" Adet hakkınız kaldı");
        }
        else if (hak == 6) {
            System.out.println("*    |---       *");
            System.out.println("*    |          *");
            System.out.println("*    |          *");
            System.out.println("*    |          *");
            System.out.println("*    |          *");
            System.out.println("*____|____      *");
            System.out.println("****************");
            System.out.println("Kelimeyi tahmin etmek için "+getHak()+ "Adet hakkınız kaldı");
        }
        else if (hak == 5) {
            System.out.println("*    |----¬     *");
            System.out.println("*    |          *");
            System.out.println("*    |          *");
            System.out.println("*    |          *");
            System.out.println("*    |          *");
            System.out.println("*____|____      *");
            System.out.println("****************");
            System.out.println("Kelimeyi tahmin etmek için "+getHak()+" Adet hakkınız kaldı");
        }
        else if (hak == 4) {
            System.out.println("*    |----¬     *");
            System.out.println("*    |    O     *");
            System.out.println("*    |          *");
            System.out.println("*    |          *");
            System.out.println("*    |          *");
            System.out.println("*____|____      *");
            System.out.println("****************");
            System.out.println("Kelimeyi tahmin etmek için " +getHak()+" Adet hakkınız kaldı");
        }
        
         else if (hak == 3) {
            System.out.println("*    |----¬     *");
            System.out.println("*    |    O     *");
            System.out.println("*    |    |     *");
            System.out.println("*    |    |     *");
            System.out.println("*    |          *");
            System.out.println("*____|____      *");
            System.out.println("****************");
            System.out.println("Kelimeyi tahmin etmek için "+getHak()+" Adet hakkınız kaldı");
        }
         else if (hak == 2) {
            System.out.println("*    |----¬     *");
            System.out.println("*    |    O     *");
            System.out.println("*    |    |     *");
            System.out.println("*    |    |     *");
            System.out.println("*    |  _| |_   *");
            System.out.println("*____|____      *");
            System.out.println("****************");
            System.out.println("Kelimeyi tahmin etmek için "+getHak()+" Adet hakkınız kaldı");
        }
         else if (hak == 1) {
            System.out.println("*    |----¬     *");
            System.out.println("*    |    O     *");
            System.out.println("*    |  --|     *");
            System.out.println("*    |    |     *");
            System.out.println("*    |  _| |_   *");
            System.out.println("*____|____      *");
            System.out.println("****************");
            System.out.println("Kelimeyi tahmin etmek için "+getHak()+" Adet hakkınız kaldı");
        }
        else if (hak == 0) {
            System.out.println("*    |----¬     *");
            System.out.println("*    |    O     *");
            System.out.println("*    |  --|--   *");
            System.out.println("*    |    |     *");
            System.out.println("*    |  _| |_   *");
            System.out.println("*____|____      *");
            System.out.println("****************");
            System.out.println("Oyun Bitti! Malesef adam asıldı");
        }
        
    }
    
            
}
