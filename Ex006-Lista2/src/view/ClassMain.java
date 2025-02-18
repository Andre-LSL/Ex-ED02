package view;

import controller.Metodos; // Importa a classe Metodos do pacote controller

public class ClassMain {
    public static void main(String[] args) {
        Metodos m = new Metodos(); // Cria uma instância da classe Metodos
        
        // Define um vetor com os números de 1 a 10
        int vetor[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Define os índices do início e do final do vetor
        int tamanhoF = vetor.length - 1;  // Índice do último elemento
        int tamanhoI = 0;  // Índice do primeiro elemento

        // Chama o método para inverter o vetor
        m.inverterVetor(vetor, tamanhoI, tamanhoF);

        // Imprime o vetor invertido no console
        System.out.print("Vetor invertido: ");
        for (int i : vetor) {  // Percorre o vetor e imprime cada elemento
            System.out.print(i + " ");
        }
    }
}
