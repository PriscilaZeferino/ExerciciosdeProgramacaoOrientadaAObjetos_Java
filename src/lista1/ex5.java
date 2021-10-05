package lista1;

public class ex5 {
	
//	Faça uma função maiorVet que descobre e retorna o maior elemento de um vetor de
//	inteiro passado por parâmetro.
//	a. Dica: reutilize a função do exercício 1.
	
	public static int maior(int a, int b) {
		if(a > b) {
			return a;
		} else if (a < b) {
			return b;
		}
		return a;
	}
	
	public static int maiorVet(int vet[]) {
		int maior = 0;
		for(int i = 0; i < vet.length; i++) {
			maior = maior(maior, vet[i]);
		}
		return maior;
	}
	

	public static void main(String[] args) {
		
        int [] vet = new int[] {1,3,5,8,6,7};
        System.out.print(maiorVet(vet)==8);
        
        int [] vet2 = new int[] {1,13,5,6,7,8};
        System.out.print(maiorVet(vet2)==13);


	}

}
