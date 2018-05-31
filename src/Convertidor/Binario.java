/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Convertidor;

import java.util.Scanner;



/**
 *
 * @author Lucho
 */
public class Binario implements Convertidor{
    @Override

 
    public double convertidorBinario(double a) {
          int exp, digito;
        double binario;
        
        exp=0;
        binario=0;
        while(a!=0){
                digito = (int) (a % 2);            
                binario = binario + digito * Math.pow(10, exp);   
                exp++;
                a = a/2;
        }
        
        return binario;
    }
}

