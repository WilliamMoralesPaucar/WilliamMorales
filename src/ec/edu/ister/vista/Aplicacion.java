/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.modelo.OperacionesBasicas;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB7-PC9-USER
 */
public class Aplicacion {
    public static void main(String[] args) {
        //OperacionesBasicas.sumaDosNumeros();
        
        //int x=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese dato"));
         //int m=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese dato"));
         //OperacionesBasicas.sumaConParametros(m,x);
         
         JOptionPane.showMessageDialog(null,OperacionesBasicas.sumaDevuelve(6, 7));
    }
    
    
}
