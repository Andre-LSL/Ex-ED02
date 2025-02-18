package view;

import controller.Metodos; // Importa a classe Metodos do pacote controller

public class ClassMain {
    public static void main(String[] args) {
        Metodos m = new Metodos(); // Cria uma instância da classe Metodos
        int valor1 = 48;
        int valor2 = 18;

        // Chama o método calcularMDC e imprime o resultado no console
        System.out.print(m.calcularMDC(valor1, valor2));
    }
}
