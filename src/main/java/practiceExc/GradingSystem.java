package practiceExc;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  GradingSystem  gsObj = new GradingSystem();
  gsObj.readMarks();
  gsObj.calcGrade();
	}

	int mark;

	public void readMarks() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter marks:");
		mark = input.nextInt();
	}


	public void calcGrade() {
        if(mark<25) {
        	System.out.println("Mark is:" +mark +"." +"Grade is:"+"F"+".");
        }
        else if((mark >=25)&&(mark<45)) {
        	System.out.println("Mark is:" +mark +"." +"Grade is:"+"E"+".");
        }
        else if((mark >=45)&&(mark<50)) {
        	System.out.println("Mark is:" +mark +"." +"Grade is:"+"D"+".");
        }
        else if((mark >=50)&&(mark<60)) {
        	System.out.println("Mark is:" +mark +"." +"Grade is:"+"C"+".");
        }
        else if((mark >=60)&&(mark<80)) {
        	System.out.println("Mark is:" +mark +"." +"Grade is:"+"B"+".");
        }
        else if(mark>=80) {
        	System.out.println("Mark is:" +mark +"." +"Grade is:"+"A"+".");
        }
	}
}
