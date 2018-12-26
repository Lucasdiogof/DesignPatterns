package AbstractFactory;

class FabricaRJ implements IFabrica {
    public Pizza getPizza(String tipo)  {
        if(tipo=="napolitana")
            return new PizzaNapolitanaCarioca();
        else if(tipo=="calabresa")
            return new PizzaCalabresaCarioca();
        return null;
    }
}
