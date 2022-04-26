/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adamasmaca;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author harun
 */
public class AdamAsmacaKelime {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<String> kelimeler = new ArrayList<String>();
        
    
    public void kelimeEkle(String kelime){
        kelimeler.add(kelime);
    }
    
    public String randomKelimeSec(ArrayList kelimeler){
        
        int temp =(int) (Math.random()*kelimeler.size());
        
        return (String)kelimeler.get(temp);
    }
    
    public char[] kelimeyiHarflerineAyır(String kelime){
        
        return kelime.toCharArray();
    }
    
    public char [] kelimeyiSakla(String kelime){
        char[] temp = kelimeyiHarflerineAyır(kelime);
        char[] altCizgi = new char[temp.length];
        
        for (int i = 0; i < temp.length; i++) {
            
            altCizgi[i] = '_';
        }
        return altCizgi;
    }
    
    public boolean harfKelimedeVarMi(String kelime ,char harf){
        char[] temp = kelimeyiHarflerineAyır(kelime);
        
        for (int i = 0; i < temp.length; i++) {
            
            if (temp[i]==harf) {
                return true;
                
            }        
        }      
        return false;
    }
    
    
}
