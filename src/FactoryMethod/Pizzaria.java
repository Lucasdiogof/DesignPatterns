package FactoryMethod;

abstract class Pizzaria {
	public Pizza pedirPizza(String tipo) {
		Pizza pizza = getPizza(tipo);

		pizza.preparar();
		pizza.assar();
		pizza.cortar();
		pizza.embalar();
		System.out.println();
		return pizza;
	}

	public abstract Pizza getPizza(String tipo);
}