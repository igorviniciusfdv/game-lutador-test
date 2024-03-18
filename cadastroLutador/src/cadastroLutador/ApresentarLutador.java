package cadastroLutador;

public class ApresentarLutador {

	public static void main(String[] args) {
		//Instânciando o objeto lutador a partir de vetor 
		Lutador l[] = new Lutador[10];
		
		//Lutadores peso leve
		l[0] = new Lutador ("Pedro", "Brasil", 25, "M", 1.78f, 65.4f, 15, 1, 0);
		
		l[1] = new Lutador ("Putscript", "Inglaterra", 32, "M",1.70f, 67.8f, 28, 5, 3);
		
		//Lutadores peso médio
		l[2] = new Lutador ("Marks", "Dinamarca", 28, "M", 1.87f, 75.8f, 18, 8, 10);
		
		l[3] = new Lutador ("Charles", "Brasil", 35, "M", 1.72f, 72.3f, 30, 1, 1);
		
		//Lutadores peso pesado
		l[4] = new Lutador ("Stanford", "Estados Unidos", 19, "M", 1.93f, 89.4f, 3, 7, 3);
		
		l[5] = new Lutador ("Nurmagomedov", "Russia", 24, "M", 1.99f, 97.4f, 20, 9, 4);
		
		//Lutadoras peso galo
		l[6] = new Lutador ("Amanda", "Brasil", 27, "F", 1.59f, 59.6f, 15, 2, 1);
		
		l[7] = new Lutador ("Keith", "Suécia", 30, "F", 1.63f, 61.2f, 28, 1, 0);
		
		//Lutadoras peso pena
		l[8] = new Lutador ("Brulesca", "China", 19, "F", 1.69f, 65.2f, 2, 7, 1);
		
		l[9] = new Lutador ("Peggy", "Japão", 24, "F", 1.78f, 69.7f, 25, 0, 0);
		
		Luta luta = new Luta();
		
		luta.marcarLuta(l[8], l[9]);
		luta.lutar();
	}

}

