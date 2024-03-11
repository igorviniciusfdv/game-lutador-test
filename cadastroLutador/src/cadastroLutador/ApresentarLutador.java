package cadastroLutador;

public class ApresentarLutador {

	public static void main(String[] args) {
		//Instânciando o objeto lutador a partir de vetor 
		Lutador l[] = new Lutador[6];
		
		//Lutadores peso leve
		l[0] = new Lutador ("Pedro", "Brasil", 25, 1.78f, 65.4f, 15, 1, 0);
		
		l[1] = new Lutador ("Putscript", "Inglaterra", 32, 1.70f, 67.8f, 28, 5, 3);
		
		//Lutadores peso médio
		l[2] = new Lutador ("Marks", "Dinamarca", 28, 1.87f, 75.8f, 18, 8, 10);
		
		l[3] = new Lutador ("Charles", "Brasil", 35, 1.72f, 72.3f, 30, 1, 1);
		
		//Lutadores peso pesado
		l[4] = new Lutador ("Stanford", "Estados Unidos", 19, 1.93f, 89.4f, 3, 7, 3);
		
		l[5] = new Lutador ("Nurmagomedov", "Russia", 24, 1.99f, 97.4f, 20, 9, 4);
		
		Luta luta = new Luta();
		
		luta.marcarLuta(l[3], l[2]);
		luta.lutar();
	}

}

