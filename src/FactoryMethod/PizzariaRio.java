package FactoryMethod;

class PizzariaRio extends Pizzaria {
	public Pizza getPizza(String tipo) {
		if (tipo == "napolitana")
			return new PizzaNapolitanaCarioca();
		else if (tipo == "calabresa")
			return new PizzaCalabresaCarioca();
		return null;
	}
}