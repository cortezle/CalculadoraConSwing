/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aritmetica;

import AbstractFactory.AbstractFactory;
import Convertidor.Convertidor;

/**
 *
 * @author Lucho
 */
public class AritmeticaFactory implements AbstractFactory {
    @Override
        public Aritmetica getAritmetica(String tipo) {
        switch (tipo) {
            case "suma":
                return new Suma();
            case "resta":
                return new Resta();
            case "multiplicacion":
                return new Multiplicacion();
            case "division":
                return new Division();

        }
        return null;
    }

    @Override
    public Convertidor getConvertidor(String tipo) {
        return null;
    }

    
}
