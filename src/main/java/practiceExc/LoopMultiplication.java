package practiceExc;

import java.util.Scanner;

public class LoopMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopMultiplication mulObj = new LoopMultiplication();
		mulObj.readNumber();
	}
	
	public void readNumber() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		int number = input.nextInt();
		mulLoop(number);
	}
    
	public void mulLoop(int number) {
		
		// print mul table
		
		for(int i=1;i<=10;i++) {
			
			System.out.println(i +" * " +number +" = " +(i*number) );
		}

	}
}
