package entities;

public class Calculo {
	
	private Double valorDol;
	private Double valorReal;
	private Double IOF = 0.06;
	
	public Calculo() {
	}

	public Calculo(Double valorDol, Double valorReal, Double iOF) {
		this.valorDol = valorDol;
		this.valorReal = valorReal;
		IOF = iOF;
	}

	public Double getValorDol() {
		return valorDol;
	}

	public void setValorDol(Double valorDol) {
		this.valorDol = valorDol;
	}

	public Double getValorReal() {
		return valorReal;
	}

	public void setValorReal(Double valorReal) {
		this.valorReal = valorReal;
	}
	
	public Double calc() {
		return valorDol * valorReal * (1.0 + IOF); 
	}
	
}
