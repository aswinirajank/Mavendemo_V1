package practiceExc;

import java.util.Scanner;

public class Rectangleifelse {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Rectangleifelse obj1 = new Rectangleifelse();
		obj1.getValue();
		obj1.shapeCheck();
	}


	int length;
	int breadth;
		
	//Accept input from user
	public void getValue() {
		//create an object of scanner class
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter length");
		
		//Take input from keyboard
		length = input.nextInt();
		
		System.out.println("Length:"+length);
		//get breadth
       Scanner input1 = new Scanner(System.in);
		
		System.out.print("Enter breadth");
		
		//Take input from keyboard
		breadth = input1.nextInt();
		//print result
		System.out.println("Breadth is:"+breadth);
	
	}
	
public void shapeCheck() {
		if(length == breadth) {
			System.out.println("It is a square:" +(length*breadth));
		}
		else {
			System.out.println("It is a rectangle:" +(length*breadth));
		}
	}

}