package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate data;
	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Mentoria() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mentoria [data=" + data + "]";
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO +20d;
	}
	
}
