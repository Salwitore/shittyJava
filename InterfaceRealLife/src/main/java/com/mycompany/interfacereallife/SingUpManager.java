/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacereallife;

/**
 *
 * @author harun
 */
public class SingUpManager {
    
    private IUserCheckService ıUserCheckService; //interfacei direkt değişken olarak atadık bunun bi ismi varmış unuttum
    
    public SingUpManager(IUserCheckService checkService){//Constructerın içine yazdık hangi checkServicei kullanıcaksa onu UserCheckService olarak kullanıcak
        
        this.ıUserCheckService = checkService;
    }
    
    public void SignUp(User user){
        
        
        
        if (ıUserCheckService.checkUser(user)) {
            System.out.println("Kullanıcı Kayıt Oldu: " + user.getName());
            
        }
        else{
            System.out.println("Kullanıcı Kayıt Olamadı.");
        }
        
        
    }
}
