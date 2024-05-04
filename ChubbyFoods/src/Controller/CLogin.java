/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.MLogin;

/**
 *
 * @author User
 */
public class CLogin {
    public boolean checkUserC(String a,String b)
    {
        MLogin ob = new MLogin();
        return ob.checkUserM(a,b);
    }
}
