package squareRoots;

import java.util.Scanner;

import org.mariuszgromada.math.mxparser.Expression;


public class SquareRootsMain {

	public static void main(String[] args) {
		
		Node nodo = new Node("primo");
		String strEspressione = nodo.getTheEspressione();
		Expression espressione = new Expression(strEspressione);
		System.out.println(strEspressione);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Premi un qualsiasi tasto per visualizzare il risultato.");
		scanner.nextLine();
		risultato(espressione);
		
	}
	public static void risultato(Expression espressione) {
		try {			
			double risposta = espressione.calculate();
			if(risposta != Double.NaN) {				
				System.out.println("Risultato: " + risposta);
			}else {
				System.out.println("Errore matematico: 0/0 non è accettabile");
			}
		}catch(Exception e) {
			System.out.println("Errore matematico (probabilmente N/0)");
		}
		
		
	}
}
