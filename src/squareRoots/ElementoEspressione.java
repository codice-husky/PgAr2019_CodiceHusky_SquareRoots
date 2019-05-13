package squareRoots;

public class ElementoEspressione extends Node {
	public static final int OPER_SOMMA = 1;
	public static final int OPER_SOTTRAZIONE = 2;
	public static final int OPER_MOLTIPLICAZIONE = 3;
	public static final int OPER_DIVISIONE = 4;
	
	private boolean isOperazione;
	private int valore;
	/**
	 * 
	 */
	public ElementoEspressione(boolean isOperazione, int valore) {
		super();
		this.isOperazione = isOperazione;
		this.valore = valore;
	}
	/**
	 * @param parentNode
	 */
	public ElementoEspressione(boolean isOperazione, int valore, ElementoEspressione parentNode) {
		super(parentNode);
		this.isOperazione = isOperazione;
		this.valore = valore;
	}
	
	public boolean aggiungiNumero(int num) {
		if(this.childNodes.size()<2) {
			childNodes.add(new ElementoEspressione(false, num, this));
			return true;
		} else return false;
	}
	
	public boolean aggiungiOperazione(int segno) {
		if(this.childNodes.size()<2) {
			childNodes.add(new ElementoEspressione(true, segno, this));
			return true;
		} else return false;
	}
	public boolean isOperazione() {
		return isOperazione;
	}
	public int getValore() {
		return valore;
	}
	
	

}
