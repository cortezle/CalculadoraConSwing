/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;


import Aritmetica.Aritmetica;
import Aritmetica.AritmeticaFactory;
import Convertidor.Convertidor;
import Convertidor.FactoryConvertidor;

/**
 *
 * @author Lucho
 */
public class FactoryProducer {
        public static AbstractFactory getAbstractFactory(String type){
        switch (type){
           case "aritmetica":
                return (AbstractFactory) new AritmeticaFactory();
            case "convertidor":
                return  (AbstractFactory) new FactoryConvertidor();
        }
       
        return null;
    }
}
