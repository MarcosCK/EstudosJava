package poo;

public class Caneta {

	 public String modelo;
	 public String cor;
	 public int valor;
	 
	 
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public void status() {
		System.out.println("Modelo caneta: " + this.modelo);
		System.out.println("Cor caneta: " + this.cor);
		System.out.println("Valor caneta: " + this.valor);
		
	}
	 
	 
}
