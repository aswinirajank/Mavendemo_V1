package practiceExc;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsoluteValue absObj= new AbsoluteValue();
		absObj.enterValue();
		absObj.absoluteValue();
	}

	int number;

	public void enterValue() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value");
		 number = input.nextInt();
		System.out.println("Number entered is " +number);
	}
	
	public void absoluteValue() {
		//int absnumber = Math.abs(number);
		//System.out.println("The absolute value of number is:" +absnumber);
		System.out.println(Math.abs(number));
	}
	
	
}
