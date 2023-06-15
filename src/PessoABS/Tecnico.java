package PessoABS;

public class Tecnico extends Aluno {
 
	 private String registroProfissional; 
	
	 public void pratica() {
		 System.out.println(this.getNome()+ " Está praticando");
	 }

	public String getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(String registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
	 
	 
}
