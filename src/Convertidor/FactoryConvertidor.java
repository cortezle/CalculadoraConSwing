/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Convertidor;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import Aritmetica.Aritmetica;

/**
 *
 * @author Lucho
 */
public class FactoryConvertidor implements AbstractFactory {
    @Override
        public Convertidor getConvertidor(String tipo) {
        switch (tipo) {
            case "binario":
                return new Binario();

        }
        return null;
    }

    @Override
    public Aritmetica getAritmetica(String type) {
        return null;
    }

  
}
