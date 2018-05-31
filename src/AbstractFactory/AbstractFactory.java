/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import Aritmetica.Aritmetica;
import Convertidor.Convertidor;

/**
 *
 * @author Lucho
 */
public interface AbstractFactory {
    Aritmetica getAritmetica(String tipo);
    Convertidor getConvertidor(String tipo);
}
