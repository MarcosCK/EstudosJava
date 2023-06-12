package poo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaBanco p1 = new ContaBanco(0, false);
		p1.setNumConta(111);
		p1.setDono("Marcao");
		p1.abrirConta("CC");
        p1.setStatus(true);
        p1.estadoAtual();
	}

}
