package AbstractFactory;

class TestaPizzaria {
	public static void main(String[] args) {
		Pizzaria p = new Pizzaria(new FabricaRJ());
		p.pedirPizza("calabresa");
		p.pedirPizza("napolitana");
		p.setFabrica(new FabricaSP());
		p.pedirPizza("calabresa");
		p.pedirPizza("napolitana");
		p.setFabrica(new FabricaGO());
		p.pedirPizza("calabresa");
		p.pedirPizza("napolitana");
	}
}