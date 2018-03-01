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
public class Estadistica {
     private double[][] datos;
    private double b0;
    private double b1;
    private double rxy;
    private double r2;
    private double yk;
    private double xk;
    private int n;

    public double calcularSxy() {//Si
        double suma = 0.0;
        for (int i = 0; i < n; i++) {
            suma += datos[i][0] * datos[i][1];
        }
        return suma;
    }
    
        public void introducirDatos() {
        n = Integer.parseInt(JOptionPane.showInputDialog("Cuantos datos quieres?"));
        datos = new double[n][n];
        for (int i = 0; i < n; i++) {
            datos[i][0] = Double.parseDouble(JOptionPane.showInputDialog("Dame x "+ i +":"));
            datos[i][1] = Double.parseDouble(JOptionPane.showInputDialog("Dame y "+ i +":"));
        }
    }

    public double calcularSx2() {//SI
        double suma = 0.0;
        for (int i = 0; i < n; i++) {
            suma += datos[i][0] * datos[i][0];
        }
        return suma;
    }

    public double calcularSx() {//SI
        double suma = 0.0;
        for (int i = 0; i < n; i++) {
            suma += datos[i][0];
        }
        return suma;
    }

    public double calcularSy() {//SI
        double suma = 0.0;
        for (int i = 0; i < n; i++) {
            suma += datos[i][1];
        }
        return suma;
    }

    

    public double calcularXm() {//Si
        return calcularSx() / n;
    }

    public double calcularYm() {//Si
        return calcularSy() / n;
    }
    
    public double calcularSy2() {//SI
        double suma = 0.0;
        for (int i = 0; i < n; i++) {
            suma += datos[i][1] * datos[i][1];
        }
        return suma;
    }

    public void calcularB1() {//Si
        b1 = (calcularSxy() - n * calcularXm() * calcularYm())
                / (calcularSx2() - n * calcularXm() * calcularXm());
    }

    public void calcularB0() {//Si
        b0 = calcularYm() - b1 * calcularXm();
    }

    public void calcularYk() {//Si
        yk = b0 + b1 * xk;
    }

    public void calcularRxy() {//Si
        rxy = (n * calcularSxy() - calcularSx() * calcularSy()) / Math.sqrt((n * calcularSx2() - calcularSx() * calcularSx()) * (n * calcularSy2() - calcularSy() * calcularSy()));
    }

    public void calcularR2() {
        r2 = rxy * rxy;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setXk(double xk) {
        this.xk = xk;
    }

    public double getB0() {
        return b0;
    }

    public double getB1() {
        return b1;
    }

    public double getRxy() {
        return rxy;
    }

    public double getR2() {
        return r2;
    }

    public double getYk() {
        return yk;
    }


}
