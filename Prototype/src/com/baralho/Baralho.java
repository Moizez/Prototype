package com.baralho;

public abstract class Baralho implements Cloneable {
	public Baralho clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		return (Baralho) clone;
	}

	public abstract void gera();

}
