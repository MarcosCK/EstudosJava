package UFC;

public class Lutador {
	
  private String nome;
  private String nacionalidade;
  private int idade;
  private double altura;
  private float peso;
  private String categoria;
  private int vitorias;
  
  
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getNacionalidade() {
	return nacionalidade;
}
public void setNacionalidade(String nacionalidade) {
	this.nacionalidade = nacionalidade;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}
public double getPeso() {
	return peso;
}
public void setPeso(float peso) {
	this.peso = peso;
	this.setCategoria();
}
public String getCategoria() {
	return categoria;
}
public void setCategoria() {
	if(this.peso < 52.2) {	
		this.categoria = "Invalido";
	} else if(this.peso <= 70.3){
		this.categoria = "Leve";
	} else if(this.peso <= 83.9) {
		this.categoria = "Medio";
	} else if(this.peso <= 120.2) {
		this.categoria = "Pesado"; 	
	}else {
		this.categoria = "Invalido" ;
	}
	
	
}
public int getVitorias() {
	return vitorias;
}
public void setVitorias(int vitorias) {
	this.vitorias = vitorias;
}
public int getDerrotas() {
	return derrotas;
}
public void setDerrotas(int derrotas) {
	this.derrotas = derrotas;
}
public int getEmpates() {
	return empates;
}
public void setEmpates(int empates) {
	this.empates = empates;
}
private int derrotas;
  private int empates;
  
  
  public void apresenta() {
	  System.out.println("Lutador: " + this.getNome());
	  System.out.println("Origem: " + this.getNacionalidade());
	  System.out.println(this.getIdade() + "Anos");
	  System.out.println(this.getAltura() + " m de Altura");
	  System.out.println("Pesando " + this.getPeso() + "Kg");
	  System.out.println("Ganhou " + this.getVitorias() + "vezes");
	  System.out.println("Perdeu " + this.getDerrotas() + "vezes");
	  System.out.println("Empatou " + this.getEmpates() + "vezes"); 
}
  
  public void status() {
	  System.out.println(this.getNome());
	  System.out.println("Categoria: " + this.getCategoria());
	  System.out.println(this.getVitorias()	+ " vitorias");
	  System.out.println(this.getDerrotas() + " derrotas");
	  System.out.println(this.getEmpates() + " empates"); 
  }
  
  public void ganharLuta() {
	  this.setVitorias(this.getVitorias()+1);
  }
  
  public void perderLuta() {
	  this.setDerrotas(this.getDerrotas()+1);
  }
  
  public void empatarLuta() {
	  this.setEmpates(this.getEmpates()+1);
  }
public Lutador(String nome, String nacionalidade, int idade, double altura, float peso, int vitorias, int derrotas,
		int empates) {
	super();
	this.nome = nome;
	this.nacionalidade = nacionalidade;
	this.idade = idade;
	this.altura = altura;
	this.vitorias = vitorias;
	this.derrotas = derrotas;
	this.empates = empates;
	this.setPeso(peso);
}
  

}
