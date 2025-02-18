package view;

import javax.swing.JOptionPane;
import controller.*;


public class ClassMain {
    public static void main (String args []) {
        int valor;
        Metodos mtd = new Metodos();
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor impar a calcular o fatorial duplo"));

        do {
            System.out.println("Número inválido! Deve ser um inteiro positivo ímpar.");
        } while (valor <= 0 || valor % 2 == 0);
        
            int resultado = mtd.calcularFatorial(valor);
            System.out.println("O fatorial duplo de " + valor + " é: " + resultado);
        }
    }
