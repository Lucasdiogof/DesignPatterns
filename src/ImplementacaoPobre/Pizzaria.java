package ImplementacaoPobre;

class Pizzaria {
	private Pizza pizza = null;

	public Pizza pedirPizza(String tipo) {

		if (tipo == "napolitana") {
			pizza = new PizzaNapolitana();
		} else if (tipo == "calabresa") {
			pizza = new PizzaCalabresa();
		} else if (tipo == "portuguesa") {
			pizza = new PizzaPortuguesa();
		} else if (tipo == "quatroqueijos") {
			pizza = new PizzaQuatroQueijos();
		}

		pizza.preparar();
		pizza.assar();
		pizza.cortar();
		pizza.embalar();
		System.out.println();
		return pizza;
	}
}