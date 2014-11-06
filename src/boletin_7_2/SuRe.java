/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_7_2;

import javax.swing.JOptionPane;

public class SuRe {
    private short num1;
    private short num2;
    public short getNum1() {
        return num1;
    }
    public void setNum1(short num1) {
        this.num1 = num1;
    }
    public short getNum2() {
        return num2;
    }
    public void setNum2(short num2) {
        this.num2 = num2;
    }
    public void compa (){
        if (num1 >= num2){
           JOptionPane.showMessageDialog(null, "El primer numero es mayor o igual y su resta es igual a " + (num1-num2) + " y su suma es igual: " + (num1+num2), "Respuesta", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "El primer numero es menor y su suma es igual a " + (num1+num2), "Respuesta", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
