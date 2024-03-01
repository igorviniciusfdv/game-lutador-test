package cadastroLutador;

public class Lutador {
	//Atributos
	private String nome; 
	private String nacionalidade;
	private int idade; 
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	//Métodos
	public String apresentar;
	public String status;
	public int ganharLutas;
	public int perderLutas;
	public int empatarLutas;
	
	public Lutador (String no, String na, int id,
					float al, float pe, int vi, int de, int em) {
		nome = no;
		nacionalidade = na;
		idade = id;
		altura = al;
		peso = pe;
		vitorias = vi;
		derrotas = de;
		empates = em;
	}
	
	public void apresentar () {
		System.out.println("----- E AI VEM ELE -----");
		System.out.println("Lutador: " + this.nome);
		System.out.println("Nacionalidade: " + this.nacionalidade);
		System.out.println("Idade: " + this.idade);
		System.out.println("Altura: " + this.altura);
		System.out.println("Peso: " + this.peso + " kgs!");
		if (peso < 70) {
			categoria = "Leve";
			System.out.println("Categoria: " + this.categoria);
		}else if (peso >= 70  && peso < 78) {
			categoria = "Médio";
			System.out.println("Categoria: " + this.categoria);
		} else {
			categoria = "Pesado";
			System.out.println("Categoria: " + this.categoria);
		}
	}
	public void status () {
		System.out.println("----- COM O CARTEL DE: -----");
		System.out.println("Vitórias: " + this.vitorias);
		System.out.println("Derrotas: " + this.derrotas);
		System.out.println("Empates: " + this.empates);
	}
	public void ganharLutas() {
		System.out.println("----- AO FINAL DA CARREIRA -----");
		ganharLutas = 10;
		this.vitorias += ganharLutas;
		System.out.println("Depois de algumas lutas o lutador tem " + this.vitorias + " vitórias!");
		
	}
	public void perderLutas() { 
		perderLutas = 5;
		this.derrotas += perderLutas;
		System.out.println("Depois de algumas lutas o lutador tem " + this.derrotas + " derrotas!");
	}
	public void empatarLutas() {
		empatarLutas = 2;
		this.empates += empatarLutas;
		System.out.println("Depois de algumas lutas o lutador tem " + this.empates + " empates!");
	}
}
