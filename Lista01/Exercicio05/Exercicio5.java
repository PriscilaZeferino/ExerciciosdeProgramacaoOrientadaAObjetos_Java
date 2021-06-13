//Faça uma função maiorVet que descobre e retorna o maior elemento de um vetor de
//inteiro passado por parâmetro.
//a. Dica: reutilize a função do exercício 1.

import java.util.Scanner;

class Exercicio5 {

    static int maiorVet(int vet[])
    {
        int maior = 0;
        for(int i = 0; i < vet.length; i++){
            if(vet[i] > maior)
            {
                maior = vet[i];
            }
        }

        return maior;
    }

    public static void main (String [] args)
    {
        int vet [] = new int [3];

        vet[0] = 2;
        vet[1] = 5;
        vet[2] = 8;

        int maior = maiorVet(vet);
        System.out.println("O maior eh: " + maior);
    }
}