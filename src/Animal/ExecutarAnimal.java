package Animal;

public class ExecutarAnimal {

	public static void main(String[] args) {
		
		
		Mamifero m = new Mamifero();
		Cachoro c = new Cachoro();
		Canguru k = new Canguru();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
	
		
		c.setPeso(15.3);
		c.setIdade(2);
		c.setMembros(3);
		c.locomover();
		c.alimentar();
		c.emitirSom();
		
		

		
		m.setPeso(85.3);
		m.setIdade(2);
		m.setMembros(4);
		m.locomover();
		p.alimentar();
		a.emitirSom();
		
	}

}
