package squareRoots;
 
 
public class Node {
   
    public static final int VALORE_MAX = 11;
   
    String valore;
    Node sx;
    Node dx;
   
   
    public Node() {
        int val = (int) Math.floor(Math.random()*2);
        //System.out.println(val);
        if(val == 0) {  //segno
            int prova = (int) Math.floor(Math.random()*4+1);
            switch(prova) {
                case 1: this.valore = "+"; break;
                case 2: this.valore = "-"; break;
                case 3: this.valore = "*"; break;
                case 4: this.valore = "/"; break;
            }
            this.sx= new Node();
            this.dx= new Node();
        }else { //numero
            this.valore =  ""+(int)((Math.random()*VALORE_MAX)+1);
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
