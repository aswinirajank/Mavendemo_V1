package practiceExc;

import java.util.Scanner;

public class LoopFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopFactorial facObj = new LoopFactorial();
		facObj.readNumber();
		facObj.factCalc();
	}
	
	int factnum;
	
	public void readNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number :");
		factnum = input.nextInt();
	}
	
	public void factCalc(){
		int number=1;
		for(int i=factnum;i>=1;i--) {
			number = i* number;
		}
		
		System.out.println("Factorial of "+factnum +" is " +number );
	}
}
