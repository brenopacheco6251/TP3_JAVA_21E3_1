package br.edu.infnet.dominio;

import br.edu.infnet.auxiliar.Constante;

public class Aluno extends Pessoa {
	
	private boolean fullstack;
	private String linguagem;
	
	//private int posicao;
	
	public Aluno() {
		this.setNome("Javeiro");
	}
	
	public Aluno(String nome, int idade) {
		this.setNome(nome);
		this.setIdade(idade);
	}

	public Aluno(String nome, int idade, float salario, boolean fullstack, String linguagem) {
		this(nome, idade);
		this.setSalario(salario);
		this.fullstack = fullstack;
		this.linguagem = linguagem;
	}
	
	private float calcularSalarioFullstack() {
		//float x = 500;
		//if (fullstack) { //(fullstack) //(!fullstack)
		//	x = 1500;
		//}
		return fullstack ? 1500 : 500;
	}
	
	private float calcularSalarioLinguagem() {
		//float y = 750;
		//if ("java".equalsIgnoreCase(linguagem)) {//linguagem == "java"
		//	y = 2000;
		//}
		return "java".equalsIgnoreCase(linguagem) ? 2000 : 750; 
	}
	
	public float calcularSalarioLiquido() {
		return getSalario() + calcularSalarioFullstack() + calcularSalarioLinguagem();
	}
	
	private static String obterSituacao(float salarioLiquido) {
		String situacao = null;
		
		if (salarioLiquido < 50) {
			situacao = "pobre";
		} else if (salarioLiquido > 100) {
			situacao = "rico";
		} else {
			situacao = "classe media";
		}
			
		return situacao;
	}
	
	public void impressao(){
		
		float calculoSalarial = calcularSalarioLiquido();
		
		System.out.printf("[%d] %s - %d anos || R$%.2f : %s\n",
				posicao,
				getNome(),
				getIdade() ,
				calculoSalarial,
				obterSituacao(calculoSalarial));
	}	
	
	@Override
	public String toString() {
	
		return "Sou o Programador " + getNome();
	}

	public boolean isFullstack() {
		return fullstack;
	}

	public void setFullstack(boolean fullstack) {
		this.fullstack = fullstack;
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}
	
}
