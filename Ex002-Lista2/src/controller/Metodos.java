package controller;

public class Metodos {
    public double calcular (double valor, double resultado) {
        return (resultado == 0) ? valor : calcular(valor - 1, resultado-1);
    }
}
