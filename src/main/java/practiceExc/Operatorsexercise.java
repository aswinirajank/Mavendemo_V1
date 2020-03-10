package practiceExc;

public class Operatorsexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2;
		int y=5;
		int z=0;
		
	    boolean eqresult = (x==2);
	    System.out.println("eqresult: " + eqresult);
	    
        boolean notequal = (x!=5);
        System.out.println("notequal: " + notequal);
        
        boolean andersult = notequal &&(y>=5);
        System.out.println("andersult: " + andersult);
        
        boolean orresult = (z!=0)|| eqresult;
        System.out.println("orresult: " + orresult);
        
        boolean negresult = !(y<10);
        System.out.println("negresult: " + negresult);
	}

	
  
}
