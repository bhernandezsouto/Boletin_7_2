/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_7_2;

import javax.swing.JOptionPane;

public class Boletin_7_2 {
    public static void main(String[] args) {
        SuRe obj = new SuRe();
        short a,b;
        String respuesta = JOptionPane.showInputDialog("Introduce el primer dato");
        a = Short.parseShort(respuesta);
        respuesta = JOptionPane.showInputDialog("Introduce el segundo dato");
        b = Short.parseShort(respuesta);
        obj.setNum1(a);
        obj.setNum2(b);
        obj.compa();
        
    }
    
}
