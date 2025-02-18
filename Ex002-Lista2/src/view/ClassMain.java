package view;

import javax.swing.JOptionPane;
import controller.Metodos;

public class ClassMain {
    public static void main (String args []) {
        double valor, valorDivisor;
        Metodos mtd = new Metodos();
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser dividido."));
        valorDivisor = Double.parseDouble(JOptionPane.showInputDialog("Digite o divisor."));
        double resultado = valor/valorDivisor;
        System.out.println(mtd.calcular(valor, resultado));
    }
}