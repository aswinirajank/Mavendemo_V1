package practiceExc;

public class Student_Task2 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student_Task2 student = new Student_Task2();
		Student_Task2 student1 = new Student_Task2("Aswini");
		
	}
	
	//Constructor without argumenst
	public Student_Task2() {
	System.out.println("No name passed, student name:Unknown");
		
	}
	
	//Constructor with parameters
	public Student_Task2(String name) {
		
		System.out.println("Name passed in constructor parameter:" +name);
	}
	
	
	
}
