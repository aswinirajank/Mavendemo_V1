package practiceExc;

public class Programming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programming lang1 = new Programming();
		Programming lang2 = new Programming("Java");	
		
	}
	
	public Programming() {
		System.out.println("I love programming languages");
	}

    public Programming(String language) {
    	System.out.println("I love " +language);
	}
}
