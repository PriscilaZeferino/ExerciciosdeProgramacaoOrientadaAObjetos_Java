// Faça uma função printaVet que recebe um vetor de int como parâmetro e o imprime
// em tela (função sem retorno). 

import java.util.Scanner;
import java.util.Random;

class Exercicio3
{

    static void printVet (int vet[]){
        for(int vetNumber: vet)
        {
            System.out.println(vetNumber);
        }
    }

    public static void main (String [] args)
    {
        Random number = new Random();

        int [] vet = new int[5];
        for(int i = 0; i < vet.length; i++) {
            vet[i] = number.nextInt(10);
        }

        printVet(vet);

    }
}