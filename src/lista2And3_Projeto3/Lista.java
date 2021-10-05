package lista2And3_Projeto3;


//Classe: Lista Crie uma classe Lista com um vetor de Integer (classe para inteiro do Java).
//Métodos:
//adicionaque recebe um Integer e adiciona no final da lista
//adicionaque recebe um Integer e uma posição adicionando na posição da lista
//desejada, os outros elementos são empurrados para frente. Exemplo: considerando a lista
//[3,6,9,6] ao adicionar(100,2) deixa a lista: [3,6,100,9,6].
//remove que recebe a posição e elimina o elemento do vetor, para o exemplo
//anterior, remove(3) deixaria lista: [3,6,100,6].
//getTamanho que retorna o tamanho atual da lista, ou seja, quantos elementos já
//foram inseridos.
//getque recebe uma posição (começando em 0) da lista e retorna o elemento.

//Atributos: o vetor com os elementos e outros que julgue necessário para o
//processamento.

public class Lista {
	
	private int vetor[] = new int [10];
	private int tamanho = 0;

	public int[] getVetor() {
		return vetor;
	}

	public void adicionarNoFinal(int num) {
		this.vetor[vetor.length-1] = num;
		tamanho++;

	}
	
	public void adicionarNoMeio(int num, int pos) {
		for(int i = pos; i < vetor.length; i++) {
			vetor[i + 1] = vetor[i];
			vetor[i] = pos;
		}
		tamanho++;
	}

	public void remove(int pos) {
		for(int i = pos; i < vetor.length; i++) {
			vetor[i - 1] = vetor[i];
			vetor[i] = pos;
		}
		tamanho--;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
}
