package Colege;

public class Aluno extends Pessoa {
	private boolean matriculado;
	private String curso;

	
	public void cancelarMatricula() {
		this.matriculado =false;
		
	}

	public boolean isMatriculado() {
		return matriculado;
	}

	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
}
