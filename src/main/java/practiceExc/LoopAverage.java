package practiceExc;

import java.util.Scanner;

public class LoopAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopAverage avgObj= new LoopAverage();
		avgObj.readNumber();
	}
	
	public void readNumber() {
		int total = 0;
		int enterednumber;
		
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter next number: ");
			enterednumber = input.nextInt();
			total = total + enterednumber;
			System.out.println("Total "+total);
		}
		Avg(total);
	}
	
   public void Avg(int total){
	   float average;
	   average = total/10;
	   System.out.println("Average is: " +average);
   }
}
