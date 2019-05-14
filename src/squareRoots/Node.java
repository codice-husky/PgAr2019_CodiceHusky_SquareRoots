package squareRoots;


public class Node {	
	
	public static final int VALORE_MAX = 11;
	
	static String valore;
	static Node sx;
	static Node dx;
	
	
	public Node() {
		int val = (int) Math.floor(Math.random()*2);
		System.out.println(val);
		if(val == 0) {	//segno
			switch((int)Math.random()*4+1) {
				case 1: this.valore = "+"; break;
				case 2: this.valore = "-"; break;
				case 3: this.valore = "*"; break;
				case 4: this.valore = "/"; break;
			}
			this.sx= new Node();
			this.dx= new Node();
		}else { //numero
			this.valore = ""+Math.random()*VALORE_MAX;
		}
	}
	
	public String getTheEspressione(){
		try {
			int x = Integer.parseInt(valore);
			return ""+x;
		}catch(NumberFormatException e) {
			return ( sx.getTheEspressione()+valore+dx.getTheEspressione());
		}
	}
	
	
}
