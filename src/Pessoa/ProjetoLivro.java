package Pessoa;

public class ProjetoLivro {

	public static void main(String[] args) {
	
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		
		p[0] = new Pessoa("Marcos", 22, "M");
		p[1] = new Pessoa("Yasmin", 25, "F");
		
		l[0] = new Livro("Java Mobile", "Marcao", 300, p[0]);
		l[1] = new Livro("Poo aprendizado", "Pedro Sp", 500, p[1]);
		l[2] = new Livro("Java avançado", "Aurelio Sol", 350, p[0]);
		
		l[2].abrir();
		l[2].avancarPag();
		System.out.println(l[2].detalhes());
		
		
		
		
		
		
	}

}
