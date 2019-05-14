package squareRoots;

import org.mariuszgromada.math.mxparser.Expression;
import org.mariuszgromada.math.mxparser.mXparser;

public class SquareRootsMain {

	public static void main(String[] args) {
		
		Node nodo = new Node();
		String strEspressione = nodo.getTheEspressione();
		Expression espressione = new Expression(strEspressione);
		String ris = mXparser.numberToAsciiString(espressione.calculate());
		System.out.println(strEspressione);
		System.out.println("Risultato: " + ris);
		
		
	}

}
