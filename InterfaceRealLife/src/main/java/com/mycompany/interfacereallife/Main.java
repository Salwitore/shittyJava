/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacereallife;

/**
 *
 * @author harun
 */
public class Main {
    
    public static void main(String[] args) {
        
        AgeUserCheckService ageUserCheckService = new AgeUserCheckService();
        ComplexUserCheckService complexUserCheckService = new ComplexUserCheckService();
        
        SingUpManager singUpManager = new SingUpManager(complexUserCheckService);
        
        singUpManager.SignUp(new User(1,"Mustafa",19));
        
        
    }
}
