package view;

import controller.SapoController;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pulo = 0;
		final int distancia = 100;
		SapoController sapo1 = new SapoController(pulo, distancia, 1);
		SapoController sapo2 = new SapoController(pulo, distancia, 2);
		SapoController sapo3 = new SapoController(pulo, distancia, 3);
		SapoController sapo4 = new SapoController(pulo, distancia, 4);
		SapoController sapo5 = new SapoController(pulo, distancia, 5);
		sapo1.start();
		sapo2.start();
		sapo3.start();
		sapo4.start();
		sapo5.start();
	}
}
