package SimpleFactory;

class Fabrica {
	public static Pizza getPizza(String tipo) {
		if (tipo == "napolitana") {
			return new PizzaNapolitana();
		} else if (tipo == "calabresa") {
			return new PizzaCalabresa();
		} else if (tipo == "portuguesa") {
			return new PizzaPortuguesa();
		} else if (tipo == "quatroqueijos") {
			return new PizzaQuatroQueijos();
		}
		return null;
	}
}