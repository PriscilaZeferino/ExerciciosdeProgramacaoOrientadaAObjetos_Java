// 7. Faça uma função ordenaVet (sem retorno) que recebe um vetor de inteiro como
// parâmetro e ordena o vetor.
// a. Dica: o exercício 7 e 6 podem envolver troca de elementos do vetor, que tal
// extrair uma função que realiza isso para te auxiliar?

class Exercicio7 {

    static void imprimirVet(int vet[])
    {
        for(int i = 0; i < vet.length; i++)
        {
            System.out.println("Invertido:" + vet[i]);
        }
    }

    static void ordenarVet(int vet[])
    {
        int guardadoVet = 0;

        for(int j = 0; j < vet.length-1; j ++)
        {
            for(int i = 0; i < vet.length-1; i++)
            {
                if(vet[i] > vet[i+1])
                {
                    guardadoVet = vet[i];
                    vet[i] = vet[i+1];
                    vet[i+1] = guardadoVet;
                }      
            }
        }
        imprimirVet(vet);
    }

    public static void main (String [] args)
    {
        int [] vet = new int [4];

        vet[0] = 145;
        vet[1] = 80;
        vet[2] = 35;
        vet[3] = 16;


        ordenarVet(vet);

    }
}