package modelo;

import java.util.Random;

public class Dado {

	private int cara;
	private int testAleatorio[] = { 0, 0, 0, 0, 0, 0, 0 };

	public int Dado(int Dado) {
		return Dado;
	}

	public int getCara() {
		return cara;
	}

	public void setCara(int cara) {
		this.cara = cara;
	}

	public int lanzarDado() {
		Random random = new Random();
		cara = random.nextInt(6) + 1;// + 2;
		return cara;
	}

	public void realizarTest(int numerotiradas) {
		numerotiradas = (int) (Math.random());
		int testAleatorio = numerotiradas;
	}

}
