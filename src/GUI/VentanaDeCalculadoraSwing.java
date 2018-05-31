/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import AbstractFactory.AbstractFactory;
import AbstractFactory.FactoryProducer;
import Aritmetica.Aritmetica;
import Convertidor.Convertidor;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lucho
 */
public class VentanaDeCalculadoraSwing extends JPanel {

    public int WIDTH = 300, widthTF = 50, widthB = 80;
    public int HEIGTH = 300, heigthTF = 30, heigthB = 30;
    public JTextField textF1, textF2, textF3, textF4;
    public JButton button1, button2, button4, button3, button5;
    AbstractFactory factory;

    public VentanaDeCalculadoraSwing() {
        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(50, 30, widthTF, heigthTF));

        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(120, 30, widthTF, heigthTF));

        textF3 = new JTextField();
        textF3.setBounds(new Rectangle(200, 30, widthTF, heigthTF));

        textF4 = new JTextField();
        textF4.setBounds(new Rectangle(150, 175, widthB, heigthB));

        button1 = new JButton("+");
        button1.setBounds(new Rectangle(120, 80, widthB, heigthB));

        button2 = new JButton("-");
        button2.setBounds(new Rectangle(120, 120, widthB, heigthB));

        button3 = new JButton("*");
        button3.setBounds(new Rectangle(30, 120, widthB, heigthB));

        button4 = new JButton("/");
        button4.setBounds(new Rectangle(30, 80, widthB, heigthB));
        button5 = new JButton("Binario");
        button5.setBounds(new Rectangle(50, 175, widthB, heigthB));

        textF1.setEditable(true);
        textF2.setEditable(true);
        textF3.setEditable(false);
        textF4.setEditable(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                factory= FactoryProducer.getAbstractFactory("aritmetica");
                Aritmetica suma=factory.getAritmetica("suma");
                textF3.setText(Float.toString(suma.sumar(Float.parseFloat(textF1.getText()),Float.parseFloat(textF2.getText()))));
                
            }

        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                factory= FactoryProducer.getAbstractFactory("aritmetica");
                Aritmetica resta=factory.getAritmetica("resta");
                textF3.setText(Float.toString(resta.restar(Float.parseFloat(textF1.getText()),Float.parseFloat(textF2.getText()))));
            }

        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                factory= FactoryProducer.getAbstractFactory("aritmetica");
                Aritmetica multiplicacion=factory.getAritmetica("multiplicacion");
                textF3.setText(Float.toString(multiplicacion.multiplicar(Float.parseFloat(textF1.getText()),Float.parseFloat(textF2.getText()))));
           
            }

        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                 factory= FactoryProducer.getAbstractFactory("aritmetica");
                Aritmetica division=factory.getAritmetica("division");
                textF3.setText(Float.toString(division.dividir(Float.parseFloat(textF1.getText()),Float.parseFloat(textF2.getText()))));
           
            }

        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                factory= FactoryProducer.getAbstractFactory("convertidor");
                Convertidor convbinario=factory.getConvertidor("binario");
                textF3.setText(Double.toString(convbinario.convertidorBinario(Double.parseDouble(textF4.getText()))));
            }

        });

        add(textF1);
        add(textF2);
        add(textF3);
        add(textF4);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);

        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGTH));
    }

}
