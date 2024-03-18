package cadastroLutador;

public class Lutador {
	//Atributos
	private String nome; 
	private String nacionalidade;
	private int idade; 
	private String sexo;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	//Método Construtor
	public Lutador (String no, String na, int id, String se,
					float al, float pe, int vi, int de, int em) {
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.sexo = se;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}
	
	//Métodos especiais 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria(); //Após definir o peso, o método setCategoria será chamado para determinar a categoria do lutador. 
							 // Por este motivo ele não recebe parâmetros.
							   
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() { //O método categoria não irá receber parâmetro 
								 //Pois é responsável por definir a categoria do objeto com base no peso.
		if (this.peso < 52.0f) {
			this.categoria = "Inválido";
		}else if (this.peso <= 58.9f) {
			this.categoria = "Peso galo";
		}else if (this.peso <= 63.7f) {
			this.categoria = "Peso pena";
		}else if (this.peso <= 71.8f) {
			this.categoria = "Peso leve";
		}else if (this.peso <= 84.9f) {
			this.categoria = "Peso médio";
		}else if (this.peso <= 105.2f) {
			this.categoria = "Peso pesado";
		}else if (this.peso > 105.3f) {
			this.categoria = "Inválido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	//Métodos publicos 
	public void apresentar() {
		System.out.println("---------- APRESENTAÇÃO ----------");
		System.out.println("Vamos apresentar agora o Lutador " + this.getNome());
		System.out.println("Nacionalidade: " + this.getNacionalidade());
		System.out.println("Com " + this.getIdade() + " anos");
		System.out.println("Pesando " + this.getPeso() + " kgs");
		System.out.println("Categoria: " + this.getCategoria());
		System.out.println("Vitórias: " + this.getVitorias());
		System.out.println("Empates " + this.getEmpates());
		System.out.println("Derrotas: " + this.getDerrotas());
	}
	public void status() {
		System.out.println("----- STATUS DO LUTADOR -----");
		System.out.println("Vitórias: " + this.getVitorias());
		System.out.println("Empates " + this.getEmpates());
		System.out.println("Derrotas: " + this.getDerrotas());
		
	}
	//Todas as vezes que este método for chamado irá contabilizar mais uma vitória 
	public void ganharLutas() {
		this.setVitorias(this.getVitorias() + 1);
	}
	//Toda as vezes que este método for chamado irá contabilizar mais uma derrota
	public void perderLutas() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	//Todas as vezes que este método for chamado irá contabilizar mais um empate 
	public void empatarLutas() {
		this.setEmpates(this.getEmpates() + 1);
	}
}
