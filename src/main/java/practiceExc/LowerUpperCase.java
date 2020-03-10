package practiceExc;

import java.util.Scanner;

public class LowerUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LowerUpperCase  ulobj = new LowerUpperCase();
		ulobj.readChar();
		ulobj.charCheck();
	}

	//Question- Is there any other way to accept char
	
	char identify;
	public void readChar() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the character ");
		identify = input.next().charAt(0);
		
	}
	
	public void charCheck() {
		
		if(Character.isUpperCase(identify)) {
			System.out.println("Upper case " +identify);
		}
		else {
			System.out.println("Lower case " +identify);
		}
	}
}
