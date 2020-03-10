package practiceExc;

import java.util.Scanner;

public class Attendenceifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Attendenceifelse attendanceObj = new Attendenceifelse();
		attendanceObj.readattendance();
		attendanceObj.attendencePercent();
	}

	
	int attendedclasses;
	int heldclasses;

	public void readattendance() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of classes attended-1");
		attendedclasses = input.nextInt();
		System.out.println("Enter number of classes held");
		heldclasses = input.nextInt();
		
	}

	public boolean medicalCondition() {
		Scanner input = new Scanner(System.in);
		System.out.println("Does the student have a medical cause");
		boolean medical = input.nextBoolean();
		return medical;
	}
	
	public void attendencePercent() {
		// int/int produces 0 when the result is a less than 1 eg:0.5 so we need to
		// change one of the int num to double/float.

		// alternate we can cast it. (double)int/int

		double attendencepercentage = (attendedclasses / (heldclasses * 1.0)) * 100;

		if (attendencepercentage < 75) {
			//Check if medical condition
			Attendenceifelse attendanceObj1 = new Attendenceifelse();
			boolean result = attendanceObj1.medicalCondition();
			if(result == true) {
				System.out.println("Attendance is:" + attendencepercentage + " " + "Exam allowed for medical reasons");
			}
			else {
				System.out.println("Attendance is:" + attendencepercentage + " " + "cannot take exam");
			}
			
			
		} else {
			System.out.println("Attendance is:" + attendencepercentage + " " + "can take exam");
		}
	}
}
