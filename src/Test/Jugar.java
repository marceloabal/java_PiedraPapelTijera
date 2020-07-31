package Test;

import Entidades.*;

public class Jugar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Peleable x = new Tijera(); 
		Peleable y = new Piedra(); 
		Peleable w = x.vs(y);

		System.out.print(w.getClass().toString());
	}

}
