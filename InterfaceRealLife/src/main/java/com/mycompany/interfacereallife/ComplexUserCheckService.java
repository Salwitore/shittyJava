/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacereallife;

/**
 *
 * @author harun
 */
public class ComplexUserCheckService implements IUserCheckService{
    
    
    @Override
    public boolean checkUser(User user){
        if (user.getAge()>18 && user.getName().startsWith("Mu")) {
            return true;
        }
        else{
            return false;
        }
    }
}
