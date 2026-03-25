package aula04;

public class carro {
	
	private String cor;
	private String marca;
	private String modelo;
	private String placa;
	private String combustivel;
	boolean movimento;
	boolean ligado;
	
	

	
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isMovimento() {
		return movimento;
	}

	public void setMovimento(boolean movimento) {
		this.movimento = movimento;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public String getModelo() {
		return modelo;
	}

	public String getPlaca() {
		if(this.placa!= null) {
		return placa;
	}else {
		return "XX1X11";
	}
	}

	public String getCombustivel() {
		return combustivel;
	}

	void acelerar() {
		if(this.ligado) {
		this.movimento = true;
		}else {
			this.movimento = false;
		}
	}
	
	void freiar() {
		this.movimento = false;
	}
	
	void ligar() {
		this.movimento = true;
	}
	
	void desligar() {
		this.movimento = false;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	
}
