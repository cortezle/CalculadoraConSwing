/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraswing;

import GUI.VentanaDeCalculadoraSwing;
import javax.swing.JFrame;

/**
 *
 * @author Lucho
 */
public class CalculadoraSwing {

    /**
     * @param args the command lVentanaDeCalculadoraSwingine arguments
     */
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Calculadora");
        ventana.setContentPane(new VentanaDeCalculadoraSwing());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.pack();
        ventana.setVisible(true);
        
        
        
        
        //aqui es donde implementamos lo de factory patter 
    }
    
}
