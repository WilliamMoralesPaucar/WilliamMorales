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
public class OperacionesBasicas {
    
    public static void sumaDosNumeros(){
        int x=5;
        int y=3;
      
        JOptionPane.showMessageDialog(null,x+y);
        
    }

    public static void sumaConParametros(int x,int m){
        int z=x+m;
        JOptionPane.showMessageDialog(null,"la suma es : "+z);
   
    }
    public static int sumaDevuelve(int x,int y){
    return x+y;
    
    }
    
            
    }

