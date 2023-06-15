package PessoABS;

public class CriarPessoa {

	public static void main(String[] args) {
          
	Visitante v1 = new Visitante();
	v1.setNome("fabricio");
	v1.setIdade(22);
	v1.setSexo("M");
	System.out.println(v1.toString());
	
	
	
	Aluno a1 = new Aluno();
	a1.setNome("marcao");
	a1.setMatricula(112314);
	a1.setCurso("ADS");
	a1.setIdade(18);
	a1.setSexo("M");
	a1.pagarMensalidade();
	Bolsista b1 = new Bolsista();
	b1.setMatricula(12352);
	b1.setNome("Jubleu");
	b1.setBolsa(12.5f);
	b1.setSexo("M");
	b1.pagarMensalidade();
	
	Tecnico t1 = new Tecnico();
	t1.setNome("Marcos");
	t1.pratica();
	
	Professor p1 = new Professor();
	p1.setNome("Marcio");
	p1.setEspecialidade("Matematica");
	p1.setSalario(2500.00f);
	p1.receberAumento();
	p1.Status();
	

	}

}
