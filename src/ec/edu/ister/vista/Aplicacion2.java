/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.modelo.ControlFlujo;
import ec.edu.ister.modelo.OperacionesBasicas;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB7-PC9-USER
 */
public class Aplicacion2 {
    public static void main(String[] args) {
    
     int op;
         
         do {
            
      op =Integer.parseInt(JOptionPane.showInputDialog(null,"MENU \n\n"+"Ingrese una opcion  \n"+"1.-SUMA DE DOS NUMEROS \n"+
              "2.-SUMA CON PARAMETROS \n"+"3.-SUMA DEVUELVE \n"+"4.-otros \n"+"9.-SALIR"));
      switch(op)
      {
          case 1:
               ControlFlujo.numeros();;
              break;
         case 2:
               OperacionesBasicas.sumaDosNumeros();
              break;
              case 3:
              OperacionesBasicas.sumaDosNumeros();
              break;
                   case 4:
               OperacionesBasicas.sumaDosNumeros();
              break;
            case 9:
             System.exit(0);
              break;
       }
         } while (op!=9);
}
       
    }

