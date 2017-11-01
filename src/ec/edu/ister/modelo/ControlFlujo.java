/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB7-PC9-USER
 */
public class ControlFlujo {
    public static  void numeros(){
    int a=3;  
    if(a>3){
        JOptionPane.showMessageDialog(null,"es mayor");
   } else if(a<3){
          JOptionPane.showMessageDialog(null,"es menor");
   }else{
           JOptionPane.showMessageDialog(null,"es igual");
   }
    }
}
