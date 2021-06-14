//Crie uma Função mmc que recebe dois número inteiros e retorna o mínimo múltiplo
//comum. Crie testes para a função;
import java.util.Scanner;

class Exercicio2 
{
    static int mdc (int a, int b)
    {
        while(b != 0)
        {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    static int mmc (int a, int b) {
        return a * (b/mdc(a,b));
    }

    public static void main (String args []){
        Scanner entrada = new Scanner (System.in);

        // System.out.println("Digite um número:    ");
        // int a = entrada.nextInt();

        // System.out.println("Digite outro número: ");
        // int b = entrada.nextInt();

        int mmc = mmc(28, 8);
        System.out.println(mmc);
    }
}