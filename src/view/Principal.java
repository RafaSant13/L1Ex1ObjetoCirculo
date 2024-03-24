package view;

import model.Circulo;

public class Principal {

	public static void main(String[] args) {
		double raio = 3;
		Circulo c = new Circulo(raio);
		System.out.println(c.getPerimetro());
		System.out.println(c.getArea());
	}

}
