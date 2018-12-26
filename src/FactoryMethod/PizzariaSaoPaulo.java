package FactoryMethod;

class PizzariaSaoPaulo extends Pizzaria {
	public Pizza getPizza(String tipo) {
		if (tipo == "napolitana")
			return new PizzaNapolitanaPaulista();
		else if (tipo == "calabresa")
			return new PizzaCalabresaPaulista();
		return null;
	}
}