/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adamasmaca;
import java.util.ArrayList;
/**
 *
 * @author harun
 */
public class AdamAsmacaKelime {
    private ArrayList<String> kelimeler = new ArrayList<String>();
        
    
    public void kelimeEkle(String kelime){
        kelimeler.add(kelime);
    }
    public String randomKelimeSec(ArrayList kelimeler){
        
        int temp =(int) (Math.random()*kelimeler.size());
        
        return (String)kelimeler.get(temp);
    }
    
    
    
    
}
