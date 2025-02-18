package controller;

public class Metodos {

    // Construtor padrão da classe Metodos
    public Metodos() {
        super(); // Chama o construtor da classe pai (caso exista)
    }

    public int[] inverterVetor(int vetor[], int tamanhoI, int tamanhoF) {
        // Caso base: se o índice inicial for maior ou igual ao final, o vetor já está invertido
        if (tamanhoI >= tamanhoF) {
            return vetor;
        } else {
            // Realiza a troca dos elementos
            int aux = vetor[tamanhoI];  // Armazena o valor do elemento no índice inicial
            vetor[tamanhoI] = vetor[tamanhoF];  // Atribui o valor do índice final ao índice inicial
            vetor[tamanhoF] = aux;  // Coloca o valor armazenado no índice final

            // Chama recursivamente a função para os próximos índices
            return inverterVetor(vetor, tamanhoI + 1, tamanhoF - 1);
        }
    }
}
