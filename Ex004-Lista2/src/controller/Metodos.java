package controller;

public class Metodos {

    public int calcularFatorial(int a) {
        return (a == 1) ? 1 : a * calcularFatorial(a);
    }   
}
