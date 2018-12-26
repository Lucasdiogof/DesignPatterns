package AbstractFactory;

class FabricaGO implements IFabrica {
	public Pizza getPizza(String tipo) {
		if (tipo == "napolitana")
			return new PizzaNapolitanaGoiana();
		else if (tipo == "calabresa")
			return new PizzaCalabresaGoiana();
		return null;
	}
}