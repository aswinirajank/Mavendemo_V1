package practiceExc;

import java.util.Scanner;

public class BonusCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BonusCalc bonus = new BonusCalc();
		bonus.readEmployeeData();
		bonus.bonusPrint();
	}
int year;
double salary;

	public void readEmployeeData() {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of years of service:");
		year = input.nextInt();
		System.out.println("No of years of service is:" + year);

		// Accept salary
		System.out.println("Enter salary:");
		salary = input.nextDouble();
		System.out.println("Salary:" + salary);
	}
	
	public void bonusPrint() {
		if(year > 5){
			double netbonus = salary*5/100;
			System.out.println("Net bonus is:" +netbonus);
		}
		else {
			System.out.println("Years of exp is less than 5");
		}
	}

}
