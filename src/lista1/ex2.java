package lista1;

public class ex2 {
	
	//Crie uma Função mmc que recebe dois número inteiros e retorna o mínimo multiplo
	//comum. Crie testes para a função;

	public static int mdc (int a, int b)
    {
        while(b != 0)
        {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
   
	public static int mmc (int a, int b) {
        return a * (b/mdc(a,b));
    }

    public static void main (String args []){

        System.out.println(mmc(28, 8)==56);
        System.out.println(mmc(8, 8)==8);
        System.out.println(mmc(6, 8)==24);
        System.out.println(mmc(12, 2)==24);


    }

}
