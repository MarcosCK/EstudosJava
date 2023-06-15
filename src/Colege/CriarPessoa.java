package Colege;

public class CriarPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("Pedro");
		p2.setNome("Yasmin");
		p2.setIdade(17);
		p2.fazerAniv();
		p3.setNome("Marcos");
		p3.setSalario(2600.80);
		p3.receberAum();
		p4.setNome("Fabio");
		
		System.out.println("Idade do " +  p2.getNome() + " " + p2.getIdade() + " anos" );
		System.out.println("Salario do " + p3.getNome() + " " + p3.getSalario());
		
	    p2.setCurso("ADS");
	    p3.setSalario(2500.75);
	    p4.setSetor("Estoque");
	    
	    
		
	}

}
