package br.edu.infnet.dominio;

public class RhEscola extends Pessoa {
	
	private float bonus;
	private float desconto;
	
	@Override
	public float calcularSalarioLiquido() {
		return getSalario() + bonus - desconto;
	}
	
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
	public float getBonus() {
		return bonus;
	}

	public float getDesconto() {
		return desconto;
	}

	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	
}

