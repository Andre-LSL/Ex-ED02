package controller;

public class Metodos {
	public Metodos(){
		super();
	}
	public int vetorPar(int vetor[], int tamanho, int qtd){
		if(tamanho < 0){
			return qtd;
		}
		if(vetor[tamanho] % 2 == 0){
			qtd += 1;
		}
		return vetorPar(vetor, tamanho-1, qtd);
	}
    public char[] calcular(double valor, double resultado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcular'");
    }
}