package lista1;

public class ex6 {
	
//	Faça uma função inverteVet (sem retorno) que recebe um vetor de inteiro como
//	parâmetro e o inverte. Troca o primeiro com o último, o segundo com o penúltimo e
//	assim sucessivamente.
	
    public static void imprimirVet(int vet[]) {
        for(int i = 0; i < vet.length; i++)
        {
            System.out.println("Invertido:" + vet[i]);
        }
    }

	public static void inverteVet(int vet[]) {        
        int guardadoVet;
        for(int i = 0; i < vet.length; i++) {
            for(int j = 0; j < i; j++) {
                guardadoVet = vet[i];
                vet[i] = vet[j];
                vet[j] = guardadoVet;
            }
        }
        imprimirVet(vet);
	}
	
	public static void main(String[] args) {
        int [] vet = new int[] {1,3,5,8,6,7};
        inverteVet(vet);
	}

}
