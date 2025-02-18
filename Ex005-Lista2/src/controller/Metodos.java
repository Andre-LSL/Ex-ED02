package controller;

public class Metodos {
    
    // Construtor padrão da classe Metodos
    public Metodos() {
        super(); // Chama o construtor da classe pai (caso exista)
    }

    public int calcularMDC(int valor1, int valor2) {
        // Se o segundo valor for zero, o primeiro é o MDC
        if (valor2 == 0) {
            return valor1;
        }
        // Se o primeiro valor for zero, o segundo é o MDC
        if (valor1 == 0) {
            return valor2;
        }
        // Chama recursivamente o método, trocando os valores e aplicando o módulo
        return calcularMDC(valor2, valor1 % valor2);
    }
}
