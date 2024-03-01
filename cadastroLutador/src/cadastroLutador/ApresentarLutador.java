package cadastroLutador;

public class ApresentarLutador {

	public static void main(String[] args) {
		Lutador lutador1 = new Lutador("Julio", "Brasileiro", 19, 1.89f, 89f, 8, 2, 1);
		lutador1.apresentar();
		lutador1.status();
		//lutador1.ganharLutas();
		//lutador1.perderLutas();
		//lutador1.empatarLutas();
		
		Lutador lutador2 = new Lutador("Calango", "Inglês", 25, 1.10f, 65f, 15, 3, 5);
		lutador2.apresentar();
		lutador2.status();
		
		Lutador lutador3 = new Lutador("Maricão Xidudets", "Africano", 38, 1.87f, 73.800f, 5, 10, 8);
		lutador3.apresentar();
		lutador3.status();
	}

}

