//Crie uma função maior que recebe dois números inteiros e retorna o maior. Crie testes
//para a função: assertivas que testem e imprimam os resultados.

import java.util.Scanner;

class Exercicio1 {

    static void maior(int a, int b)
    {
        if(a > b)
        {
            return a;
        }
        else if(a < b)
        {
            return b
        }
        else
        {
            return 0;
        }
    }

    public static void main(String args[])
    {
        Scanner entrada = new Scanner(System.in);
        
        try {

            System.out.println("Digite o primeiro numero: ");
            int a = entrada.nextInt();

            System.out.println("Digite o primeiro numero: ");
            int b = entrada.nextInt();
            
            int result = maior(a, b);

            if(result == 0)
            {
                System.out.println("São iguais")
            }
            else
            {
                System.out.println(result + " eh maior")
            }
        }
        catch (Exception error) {
            System.out.println("Valor inválido!");
        }
     
    }


}