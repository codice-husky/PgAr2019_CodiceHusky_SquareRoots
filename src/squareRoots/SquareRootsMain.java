package squareRoots;

import org.mariuszgromada.math.mxparser.Expression;
import org.mariuszgromada.math.mxparser.mXparser;

public class SquareRootsMain {

	public static void main(String[] args) {
		
		Node nodo = new Node();
		String strEspressione = nodo.getTheEspressione();
		Expression espressione = new Expression(strEspressione);
		System.out.println(strEspressione);
		double ris = espressione.calculate();
		System.out.println("Risultato: " + ris);
		
		
	}

}
