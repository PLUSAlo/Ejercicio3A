/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2b;

import javax.swing.JOptionPane;

/**
 *
 * @author alo_m
 */
public class EstadisticaTest {
 public static void main(String[] args) {
        Estadistica e1 = new Estadistica();
        
        e1.introducirDatos();
        e1.setXk(Double.parseDouble(JOptionPane.showInputDialog("Valor de dato Xk: ")));
        e1.calcularB1();//SI
        e1.calcularB0();//Si
        e1.calcularRxy();//Si
        e1.calcularR2();//SI
        e1.calcularYk();//Si
        JOptionPane.showMessageDialog(null,"B0= "+e1.getB0()+"\nB1= "+e1.getB1()+"\nRxy= "+e1.getRxy()+"\nR2= "+e1.getR2()+
               "\nYk= "+e1.getYk());
    }
}
