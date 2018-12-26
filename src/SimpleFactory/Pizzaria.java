package SimpleFactory;

class Pizzaria {
	public Pizza pedirPizza(String tipo) {
		Pizza pizza = Fabrica.getPizza(tipo);
		pizza.preparar();
		pizza.assar();
		pizza.cortar();
		pizza.embalar();
		System.out.println();
		return pizza;
	}
}