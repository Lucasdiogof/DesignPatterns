package ImplementacaoPobre;

abstract class Pizza {
	public abstract void preparar();

	public void assar() {
		System.out.println("assar a 300 graus...");
	}

	public void cortar() {
		System.out.println("cortando na diagonal...");
	}

	public void embalar() {
		System.out.println("embalando para viagem...");
	}
}


