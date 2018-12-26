package FactoryMethod;

class Cliente {
	public static void main(String[] args) {
		Pizzaria p = new PizzariaSaoPaulo();
		p.pedirPizza("napolitana");
		p.pedirPizza("calabresa");
		p = new PizzariaRio();
		p.pedirPizza("napolitana");
		p.pedirPizza("calabresa");
		p = new PizzariaGoiania();
		p.pedirPizza("napolitana");
		p.pedirPizza("calabresa");
	}
}