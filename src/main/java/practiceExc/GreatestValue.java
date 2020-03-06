package practiceExc;

import java.util.Scanner;

public class GreatestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreatestValue obj1 = new GreatestValue();
		obj1.getValue();
		obj1.greaterCheck();
	}
	
	int value1;
	int value2;
	
	public void getValue() {
		//create an object of scanner class
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first value");
		
		//Take input from keyboard
		value1 = input.nextInt();
		
		System.out.println("First number:"+value1);
		//get breadth
       Scanner input1 = new Scanner(System.in);
		
		System.out.print("Enter second value2");
		
		//Take input from keyboard
		value2 = input1.nextInt();
		//print result
		System.out.println("Second number:"+value2);
	
	}
	
	public void greaterCheck() {
		if(value1 == value2) {
			System.out.println("Value is the same " + value1);
		}
		else if(value1> value2) {
			System.out.println("Greater value is " + value1);
		}
		else {
			System.out.println("Greater value is " + value2);
		}
	}

}
