package AbstractFactory;

class Pizzaria {
	private IFabrica fabrica;

    public Pizzaria(IFabrica fabrica)   {
        this.fabrica = fabrica;
    }

    public void setFabrica(IFabrica fabrica) {
        this.fabrica = fabrica;
    }

    public Pizza pedirPizza(String tipo)    {
        Pizza pizza = fabrica.getPizza(tipo);

        pizza.preparar();
        pizza.assar();
        pizza.cortar();
        pizza.embalar();
        System.out.println();
        return pizza;
    }
}