package com.baralho;

public class Main {

	public static void main(String[] args) {

		Cartas.carregaCartas();

		Cartas.getCarta("Valete").gera();
		Cartas.getCarta("Dama").gera();
		Cartas.getCarta("Rei").gera();
		Cartas.getCarta("Ás").gera();
		Cartas.getCarta("Rei").gera();
		Cartas.getCarta("Valete").gera();		
		
	}

}
