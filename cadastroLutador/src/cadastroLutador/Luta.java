package cadastroLutador;

import java.util.Random;

public class Luta {
	//Atributos
	private Lutador desafiante; //Instância de objeto da classe Lutador
	private Lutador desafiado; //Instância de objeto da classe Lutador
	private boolean aprovada;
	private int rounds;
	
	//Métodos Públcos
	public void marcarLuta(Lutador l1, Lutador l2) { // l1 e l2 são objetos da classe Lutador 
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
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
			int vencedor = aleatorio.nextInt(3); //Irá randomizar o número entre 0 e 2 
			switch(vencedor) { //Estrutura escolha (Irá denominar quem é o vencedor da luta)
				case 0: // Empate
					System.out.println("Empatou");
					this.desafiante.empatarLutas();
					this.desafiado.empatarLutas();
					break;
				case 1: // Desafiante vence
					System.out.println("O vencedor é: " + this.desafiante.getNome());
					this.desafiante.ganharLutas();
					this.desafiado.perderLutas();
					break;
				case 2: // Desafiado vence
					System.out.println("O vencedor é: " +this.desafiado.getNome());
					this.desafiante.perderLutas();
					this.desafiado.ganharLutas();
					break;
					
				/*O break sempre tem que ser usado ao definir ao final de cada case para que o programa pare de executar e não
				 *entre em looping.	
				 */
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
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	
	
	
}
