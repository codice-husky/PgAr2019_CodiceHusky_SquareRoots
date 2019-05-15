package squareRoots;
 
 
public class Node {
   
    public static final int VALORE_MAX = 10;
   
    String valore;
    Node sx;
    Node dx;
    String simboli[] = {"+","-","*","/"}; 
    
    /*abbiamo 2 costruttori perché il primo viene chiamato al primo
      ciclo e conterrà sempre un simbolo, dal secondo ramo invece sarà
      o un simbolo o un valore*/
    public Node(String primo) {
    	int simb = (int) Math.floor(Math.random()*4);
    	this.valore = simboli[simb];
    	this.sx= new Node();
        this.dx= new Node();
    }
    
    public Node() {
        int val = (int) Math.floor(Math.random()*2);
        //System.out.println(val);
        if(val == 0) {  //segno
            int simb = (int) Math.floor(Math.random()*4);
            this.valore = simboli[simb];
            this.sx= new Node();
            this.dx= new Node();
        }else { //numero
            this.valore =  ""+(int)Math.round((Math.random()*VALORE_MAX));
        }
    }
   
    public String getTheEspressione(){
        try {
            int x = Integer.parseInt(valore);
            return ""+x;
        }catch(NumberFormatException e) {
            String risp = "("+sx.getTheEspressione()+valore+dx.getTheEspressione()+")";
            return (risp);
        }
    }
   
   
}
