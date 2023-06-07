package poo;

public class ContaBanco {

	
	 public int numConta;
	 protected String conta;
	 private String Dono;
	 private float saldo;
	 private boolean status;
	 
	 
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public String getDono() {
		return Dono;
	}
	public void setDono(String dono) {
		Dono = dono;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void estadoAtual() {
		System.out.println("Conta:  " + this.getNumConta());
		System.out.println("Tipo: " + this.getConta());		
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo " + this.getSaldo());
		System.out.println("Status conta: "  + this.getStatus());
		
		 
	}
	
	
	public void abrirConta(String t) {
	  this.setConta(t);
	  this.setStatus(true);
	  if (t == "CC") {
		  this.setSaldo(50);
	  }else if (t == "CP"){
		  this.setSaldo(150);
	  }
	  System.out.println("Conta aberta com sucesso!");
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada pois ainda tem dinheiro");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada pois ainda tem debito");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechado com  sucesso!");
		}
			
	}
	
	public void depositar(float v) {
		if (this.getStatus() ) {
			this.saldo = this.saldo + v;
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Deposito realizado na conta de " + this.getDono());
		}else {
			System.out.println("Impossivel depositar em uma conta fechada");	
		}
	}
	
	public void sacar(float v) {
		 if (this.getStatus()) {
			 if (this.getSaldo() >= v) {
				 this.setSaldo(this.getSaldo() - v);
				 System.out.println("Saque realizado na conta de " + this.getDono());
			 }else{
				 System.out.println("Saldo insuficiente para sacar");
			 }
		 }else{
				 System.out.println("Impossivel sacar de uma conta fechada");
			 }
		 }
		
	public void pagarMensal() {
	     int v = 0;
	     if(this.getConta() == "CC" ) {
	    	 v = 12;
	     }else if (this.getConta() == "CP"){
	    	 v = 20;
	     } 
	     if(this.getStatus()) {
	    	 this.setSaldo(this.getSaldo() - v);
	    	 System.out.println("Mensalidade paga com sucesso por: " + this.getDono());
	     }else {
	    	 System.out.println("Impossivel pagar uma conta fechada");
	     }
	}
	
	public ContaBanco(float saldo, boolean status) {
		this.saldo = 0;
		this.status = false;
	}
	
	
	 
}
