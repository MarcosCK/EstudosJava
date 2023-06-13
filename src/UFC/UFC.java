package UFC;

public class UFC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lutador l[] = new Lutador[6];
             
		l[0] = new Lutador("Marcos", "Brasil", 17, 1.85f, 85.0f, 11, 2, 1);
		
		 l[1] = new Lutador("Cleber", "Australia", 18, 1.70f, 85.0f, 9, 2, 1);
		 
		l[2] = new Lutador("Shador", "EUA", 20, 1.90f, 90.0f, 17, 2, 1);
		
		l[3] = new Lutador("Maluqeuias", "Egito", 20, 1.90f, 90.0f, 17, 2, 1);
	
		l[4] = new Lutador("Loki", "Suiça", 20, 1.90f, 90.0f, 17, 2, 1);
		
		l[5] = new Lutador("Thor", "Noruega", 20, 2.00f, 90.0f, 17, 2, 1);
		
	      
		Luta UEC01 = new Luta();	
		UEC01.marcarLuta(l[1], l[2]);
		UEC01.Lutar();
		 
	} 

}
