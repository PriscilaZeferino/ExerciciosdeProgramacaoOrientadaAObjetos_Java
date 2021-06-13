//Faça uma função leVet que recebe um inteiro e cria um vetor com o tamanho passado
//por parâmetro, após a função lê do teclado os valores inteiros para cada posição do
//vetor, por fim o vetor é retornado.

import java.util.Scanner;

class Exercicio4 {

    static int[] leVet(int sizeVet) {

        Scanner entrada = new Scanner(System.in);

        int [] vet = new int [sizeVet];

        for(int i = 0; i < vet.length; i++)
        {
            System.out.printf("Informe um valor: ");
            vet[i] = entrada.nextInt();
        }

        return vet;
    }

    public static void main (String [] args)
    {
        leVet(5);
    }
}