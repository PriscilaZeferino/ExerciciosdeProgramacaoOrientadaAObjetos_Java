package lista2And3_Projeto2;

//Classe: Estudante
//Atributos: nome, idade, vetor de notas (3 notas float) .
//Método: fazAniversario incrementa em um a idade
//Método : insereNota insere a nota passada por parâmetro no trimestre passado por
//parâmetro (de 1 a 3)
//Método : calculaMedia calcula a média das notas

public class Estudante {
	
	private final String nome;
	private int idade;
	private float[] notas = new float[3];
	
	public Estudante(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void fazAniversário(int idade) {
		this.idade += 1;
	}

	public float[] getNotas() {
		return this.notas;
	}

	public void insereNota(float nota, int trimestre) {
		
		if(trimestre == 1) {
			this.notas[0] = nota;
		} else if (trimestre == 2) {
			this.notas[1] = nota;
		} else if (trimestre == 3) {
			this.notas[2] = nota;
		}

	}
	
	public float calculaMedia() {
		
		float media = (this.notas[0] + this.notas[1] + this.notas[2])/3;
		return media;
	}
	
	

}
