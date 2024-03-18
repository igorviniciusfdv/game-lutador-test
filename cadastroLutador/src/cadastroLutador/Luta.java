package cadastroLutador;

import java.util.Random;

public class Luta {
	//Atributos
	private Lutador desafiante; //Instância de objeto da classe Lutador
	private Lutador desafiado; //Instância de objeto da classe Lutador
	private boolean aprovada;
	int rounds = 1;
	int stamina1 = 100, stamina2 = 100;
	//Métodos Públcos
	public void marcarLuta(Lutador l1, Lutador l2) { // l1 e l2 são objetos da classe Lutador 
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2 && l1.getSexo().equals(l2.getSexo())) {
			this.aprovada = true;
			this.desafiante = l1;
			this.desafiado = l2;
		}else {
			System.out.println("A luta não pode acontecer!");
			this.aprovada = false;
			desafiante = null;
			desafiado = null;
		}
	
	}
	
	public void lutar() {
		if (this.aprovada) {
			System.out.println("Apresentando o DESAFIANTE");
			this.desafiante.apresentar();
			System.out.println("Apresentando o DESAFIADO");
			this.desafiado.apresentar();
			
			System.out.println("----- LUTANDO -----");
			Random aleatorio = new Random(); //Objeto da classe random, para randomizar números 
			for (rounds = 1; rounds <= 5; rounds ++) {
				int golpe = aleatorio.nextInt(101);
				int stamina = aleatorio.nextInt(51);
				System.out.println("----- ROUND " + rounds + " -----");
				if (golpe <= 50) {
					stamina1 = stamina1 - stamina;
					System.out.println(this.desafiante.getNome() + " perdeu " + stamina + " de vida");
					if (stamina1 <= 0) {
						break;
					}
					
				}else if (golpe > 50) {
					stamina2 = stamina2 - stamina;
					System.out.println(this.desafiado.getNome() + " perdeu " + stamina + " de vida");
					if (stamina2 <= 0) {
						break;
					}
				
				}
			
			}
			
			System.out.println("----- FIM DE LUTA ----- ");
			
			if (stamina1 > stamina2) {
				System.out.println(this.desafiante.getNome() + " GANHOU A LUTA!!!");
				this.desafiante.ganharLutas();
				this.desafiado.perderLutas();
				
				
			}else if (stamina2 > stamina1) {
				System.out.println(this.desafiado.getNome() + " GANHOU A LUTA!!!");
				this.desafiante.perderLutas();
				this.desafiado.ganharLutas();
				
			}else {
				System.out.println(this.desafiante.getNome() + " e " + this.desafiado.getNome() + " EMPATARAM A LUTA!!!");
				this.desafiado.empatarLutas();
				this.desafiante.empatarLutas();
				
			}
			

			
		}
	}
	
	
	//Métodos Especiais 
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public boolean getAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	
		
}
