package practiceExc;

import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AgeCalculator ageObj = new AgeCalculator();
		ageObj.readAge();
		ageObj.calcAge();
	}
 int agePerson1;
 int agePerson2;
 int agePerson3;
 
  public void readAge() {
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter age of person1");
	  agePerson1 = input.nextInt();
	  System.out.println("Enter age of person2");
	  agePerson2 = input.nextInt();
	  System.out.println("Enter age of person3");
	  agePerson3 = input.nextInt();
  }
  
  public void calcAge() {
	  int youngest;
	  int oldest;
	  String youngestPerson;
	  String oldestPerson;
	  if(agePerson1<agePerson2){
		  youngest=agePerson1;
		  oldest=agePerson2;
		  youngestPerson = "Person1";
		  oldestPerson = "Person2";
	  }
	  else {
		  youngest=agePerson2;
		  oldest=agePerson1;
		  youngestPerson = "Person2";
		  oldestPerson = "Person1";
	  }
	  
	  if(youngest<agePerson3) {
		  System.out.println("Yongest person is :" +youngestPerson);
		  System.out.println("youngestPerson is "+youngest);
	  }
	  else{
		  youngest=agePerson3;
		  youngestPerson = "Person3";
		  System.out.println("Yongest person is :" +youngestPerson);
		  System.out.println("youngestPerson is "+youngest);  
	  }
	  
	  if(oldest>agePerson3){
		  System.out.println("Oldest person is :" +oldestPerson);
		  System.out.println("Oldest Person is "+oldest);  
	  }
	  else {
		  oldest=agePerson3;
		  oldestPerson="Person3";
		  System.out.println("Oldest person is :" +oldestPerson);
		  System.out.println("Oldest Person is "+oldest); 
	  }
  }
}
