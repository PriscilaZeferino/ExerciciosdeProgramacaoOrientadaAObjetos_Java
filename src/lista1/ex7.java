package lista1;

public class ex7 {

//	Faça uma função ordenaVet (sem retorno) que recebe um vetor de inteiro como
//	parâmetro e ordena o vetor.
//	a. Dica: o exercício 7 e 6 podem envolver troca de elementos do vetor, que tal
//	extrair uma função que realiza isso para te auxiliar?
	
    public static void imprimirVet(int vet[]) {
        for(int i = 0; i < vet.length; i++)
        {
            System.out.println(vet[i]);
        }
    }
    
	public static void ordenaVet(int vet[]) {        
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
        ordenaVet(vet);
	}
}
