package practiceExc;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Question- Isthere a better way to do this, 
		//as I am not using any of these objects anywhere.
		
		//Calling constructors
		Rectangle rect= new	Rectangle();
		Rectangle rect1= new Rectangle(10,20);
		Rectangle rect2= new Rectangle(10);
	}
	
	


public Rectangle() {
	 int length = 0;
	 int breadth=0;
	 int area = length*breadth;
	 
	 System.out.println("Area of rectangle is :"+area);
 }
 
public Rectangle(int length, int breadth) {
	
	 int area = length*breadth;
	 
	 System.out.println("Area of rectangle is :"+area);
 }
 
public Rectangle(int measurement) {
	 int length = measurement;
	 int breadth=measurement;
	 int area = length*breadth;
	 
	 System.out.println("Area of rectangle is :"+area);
	 
}


}
