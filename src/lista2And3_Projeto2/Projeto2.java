package lista2And3_Projeto2;

//Crie uma pessoa, coloque seu nome e idade iniciais, faça alguns aniversários (aumentando
//a idade) e imprima seu nome e sua idade, altere suas notas dos 3 trimestres e calcule a
//média.

public class Projeto2 {

	public static void main(String[] args) {
		
		Estudante aluno1 = new Estudante("Bianca", 10);
		
		System.out.println("TESTE");
		System.out.println(aluno1.getNome().equals("Bianca")); //True
		System.out.println(aluno1.getIdade()==10); //True - idade = 10;
		System.out.println(aluno1.getNotas()==null); //True -
		
		
		System.out.println("ALUNO");
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getIdade());
		
//		System.out.println("INSERINDO NOTAS");
		aluno1.insereNota(10, 3);
		aluno1.insereNota(4, 1);
		aluno1.insereNota(7, 2);
		
		
		System.out.println("VERIFICANDO NOTAS");
		System.out.println(aluno1.getNotas()[0]);
		System.out.println(aluno1.getNotas()[1]);
		System.out.println(aluno1.getNotas()[2]);


		System.out.println("MEDIA DAS NOTAS");
		System.out.println(aluno1.calculaMedia());

		
		System.out.println("NOVA MEDIA DE NOTAS");

//		System.out.println("INSERINDO NOTAS");
		aluno1.insereNota(8, 3);
		aluno1.insereNota(8, 1);
		aluno1.insereNota(9, 2);
		

		System.out.println(aluno1.calculaMedia());

		
//		aluno1.fazAniversário(0);


	}

}
