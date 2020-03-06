package JavaPractice;

public class MethodsDemo {

public static void main(String[] args) {
   // TODO Auto-generated method stub
	MethodsDemo m = new MethodsDemo();
	m.addition();
	m.subtraction(10,3);
	int multiplication=m.multiplication();
	System.out.println("Multiplication:" +multiplication);
	
	}

public void addition(){
	int num1=10;
	int num2=20;
	int sum=num1+num2;
	System.out.println("Addition result:"+sum);
	}
	

	public void subtraction(int num1, int num2) {
	int num3 = num1-num2;
	System.out.println("Subtraction result:" + num3);
	}
	
	
	public int multiplication(){
		int num1= 10;
		int num2= 11;
		int num3 = num1*num2;
		return num3;	
	}

	
}
