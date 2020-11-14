package com.baralho;

import java.util.Hashtable;

public class Cartas {

	private static Hashtable<String, Baralho> cartaMap = new Hashtable<String, Baralho>();

	public static void carregaCartas() {
		Valete cartaValete = new Valete();
		cartaMap.put("Valete", cartaValete);

		Dama cartaDama = new Dama();
		cartaMap.put("Dama", cartaDama);

		Rei cartaRei = new Rei();
		cartaMap.put("Rei", cartaRei);

		As cartaAs = new As();
		cartaMap.put("Ás", cartaAs);
	}

	public static Baralho getCarta(String nome) {
		Baralho baralho = cartaMap.get(nome);

		return baralho.clone();
	}

}
