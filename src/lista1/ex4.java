package lista1;

import java.util.Arrays;
import java.util.Scanner;

public class ex4 {

//	Faça uma função leVet que recebe um inteiro e cria um vetor com o tamanho passado
//	por parâmetro, após a função lê do teclado os valores inteiros para cada posição do
//	vetor, por fim o vetor é retornado.
	
	public static int [] leVet(int tamanho) {
		
		int [] vet = new int [tamanho];
        
        for(int i = 0; i < tamanho; i++) {
            System.out.printf("Informe um valor: ");
            vet[i] = new Scanner(System.in).nextInt();
        }

		return vet;
	}
	
	public static void main(String[] args) {
		
		int[] novoVet = leVet(4);
		System.out.println(Arrays.toString(novoVet));
	}

}
