package PessoABS;

public class Professor extends Pessoa{

	 private String especialidade;
	 private float salario;
	 
	 
	 public void receberAumento() {
		 this.salario += 700;
	 }
	 
	 public void Status() {
		 System.out.println("Nome professor: " + this.getNome() + "\n Especialidade: " + this.getEspecialidade() 
		 + "\n Salario atual: " + this.getSalario());
	 }


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}
	
}
