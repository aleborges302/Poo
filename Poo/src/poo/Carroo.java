package poo;

import java.util.Random;

public class Carroo {

	int ano;
	String cor;

public Carroo() {
	Random gerador = new Random();
	int chassi = gerador.nextInt(1000);
	System.out.println("Chassi:" + chassi);
}

public Carroo(int ano, String cor) {
	this.ano = ano;
	this.cor = cor;
}

	void ligar() {
		System.out.println("engine on..............");
	}

	void desligar() {
		System.out.println("engine OFF..............");
	}

	void acelerar() {
		System.out.println("vrummmmmmmmmm");
	}

}
