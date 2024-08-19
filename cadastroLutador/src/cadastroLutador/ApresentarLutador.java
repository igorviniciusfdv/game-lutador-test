package cadastroLutador;


public class ApresentarLutador {

	public static void main(String[] args)  {
		//Instânciando o objeto lutador a partir de vetor 
		Lutador l[] = new Lutador[12];
		
		//Lutadores peso leve
		l[0] = new Lutador ("Pedro", "Brasil", 25, "M", 1.78f, 65.4f, 15, 1, 0, 1000);
		
		l[1] = new Lutador ("Julian", "Inglaterra", 32, "M",1.70f, 67.8f, 28, 5, 3, 1010);
		
		//Lutadores peso médio
		l[2] = new Lutador ("Marks", "Dinamarca", 28, "M", 1.87f, 75.8f, 18, 8, 10, 1020);
		
		l[3] = new Lutador ("Charles", "Brasil", 35, "M", 1.72f, 72.3f, 30, 1, 1, 1030);
		
		//Lutadores peso pesado
		l[4] = new Lutador ("Stanford", "Estados Unidos", 19, "M", 1.93f, 89.4f, 3, 7, 3, 1040);
		
		l[5] = new Lutador ("Nurmagomedov", "Russia", 24, "M", 1.99f, 97.4f, 20, 9, 4, 1050);
		
		//Lutadoras peso galo
		l[6] = new Lutador ("Amanda", "Brasil", 27, "F", 1.59f, 59.6f, 15, 2, 1, 1060);
		
		l[7] = new Lutador ("Keith", "Suécia", 30, "F", 1.63f, 61.2f, 28, 1, 0, 1070);
		
		//Lutadoras peso pena
		l[8] = new Lutador ("Brulesca", "China", 19, "F", 1.69f, 65.2f, 2, 7, 1, 1090);
		
		l[9] = new Lutador ("Peggy", "Japão", 24, "F", 1.78f, 69.7f, 25, 0, 0, 1100);
		
		l[10] = new Lutador ("Rounda", "EUA", 35, "F", 1.69f, 55.7f, 29, 1, 2, 1110);
		
		l[11] = new Lutador ("Maggey", "Polônia", 28, "F", 1.55f, 53.9f,15, 9, 0, 1120);
		
		
		Luta luta = new Luta(); //Instanciando um objeto para que ocorra o combate entre os lutadores
		
		LutadorDao dao = new LutadorDao();
		boolean status;
		
		status = dao.conectar();
		//Condição para verificar a conexão com o bando de dados e consequentemente a inclusão dos dados na tabela SQL
		if (status == false) {
			System.out.println("Erro ao conectar o banco de dados");
		}else {
			status = dao.salvarLutador(l);
			if (status == false) {
				System.out.println("Erro ao incluir dados dos lutadores na tabela");
			}else {
				System.out.println("Dados incluídos com sucesso");
			}
			
			dao.desconect();
			
			
		}
		
	}

}

