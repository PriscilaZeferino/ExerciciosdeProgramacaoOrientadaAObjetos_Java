package lista2And3_Projeto1;

//Faça testes criando um livro, realizando leituras e verificando se o livro acabou e em que
//página se encontra até o livro acabar, recomece a leitura e faça novas leituras.

public class projeto1 {

	public static void main(String[] args) {
		
		Livro livro = new Livro("A casa", 200);
		livro.ler(-10);
		System.out.println(livro.getPaginasLidas()==0);

		System.out.println(livro.getTitulo());
		System.out.println(livro.getPaginas()==200);
		System.out.println(livro.getPaginasLidas()==0);

		livro.ler(330);
		System.out.println(livro.getPaginasLidas()==200);

		livro.recomeca();
		
		System.out.println(livro.ler(0));
		System.out.println(livro.getPaginasLidas()==0);

		System.out.println(livro.ler(10));
		System.out.println(livro.getPaginasLidas()==10);
		
		livro.recomeca();
		System.out.println(livro.getPaginasLidas()==0);

	}

}
