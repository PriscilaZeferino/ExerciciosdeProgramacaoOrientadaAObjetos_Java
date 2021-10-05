package lista2And3_Projeto1;

//Classe: Livro
//Atributos: titulo, páginas, número de páginas lidas.
//Método: recomeca  que recomeça a leitura do livro
//Método: ler  le um número de páginas e retona se o livro já foi todo lido ou não
//(boolean). Observe que o número de páginas lidas não pode ultrapassar o número de
//páginas do livro.

public class Livro {
	
	private final String titulo;
	private final int paginas;
	private int paginasLidas;
	
	public Livro(String titulo, int paginas) {
		this.titulo = titulo;
		this.paginas = paginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getPaginas() {
		return paginas;
	}
	
	public void recomeca() {
		this.paginasLidas = 0;
	}

	public int getPaginasLidas() {
		return paginasLidas;
	}

	public boolean ler(int paginasLidas) {
		
		if((paginasLidas > 0) && (this.paginasLidas+paginasLidas) > this.paginas) {
			this.paginasLidas = this.paginas;
		} else if( (paginasLidas > 0) && (this.paginasLidas+paginasLidas) < this.paginas) {
			this.paginasLidas += paginasLidas;
		} else {
			this.paginasLidas += 0;
		}
		
		if(this.paginasLidas == paginas) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
