package practiceExc;

public class LoopASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopASCII asciiObj = new LoopASCII();
		asciiObj.printasciiChar();
	}

	public void printasciiChar() {
		for (int i = 0; i <= 255; i++) {
			/*
			 * method one did not work String eqChar =Character.toString((char)i);
			 * System.out.println(eqChar);
			 */

			/*
			 * method 2 did not work char asciivalue = (char)i;
			 * System.out.println("Ascii of "+i+" is " +asciivalue);
			 */

		}
	}
}
