package Control;
 

public class ControleRemoto implements Controlador {

	 private int volume;
	 private boolean ligado;
	 private boolean tocando;
	 
	 public void Contrutor() {
		 this.volume = 50;
		 this.ligado = false;
		 this.tocando = false;
	 }

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean isLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean isTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		// TODO Auto-generated method stub
	   System.out.println("-----------MENU--------------");
	   System.out.println("Esta ligado ? " +  this.isLigado());
	   System.out.println("Esta tocando ? " + this.isTocando());
	   System.out.println("Volume: " +  this.getVolume());
	   for (int i = 0; i <= this.getVolume(); i+=10) {
		   System.out.println("|");
	   }
	}

	@Override
	public void fecharMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maisVolume() {
		// TODO Auto-generated method stub
		if(this.isLigado()) {
			this.setVolume(this.getVolume()+1);
		} else {
			 System.out.println("Impossivel aumentar volume");	
		}
	}

	@Override
	public void ligarMudo() {
		// TODO Auto-generated method stub
		if(this.isLigado() && (this.getVolume() > 0)) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		// TODO Auto-generated method stub
		if(this.isLigado() && (this.getVolume()==0)) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		if(this.isLigado() && !(this.isTocando())) {
			this.setTocando(true);
		}
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		if(this.isLigado() && (this.isTocando())) {
			this.setTocando(false);
		}
	}

	@Override
	public void menosVolume() {
		// TODO Auto-generated method stub
		if(this.isLigado()==true) {
			this.setVolume(this.getVolume()-5);
		} else {
		 System.out.println("Impossivel diminuir volume");	
		}
	}
	 
	
	
	 
}
