package JavaPractice;

public class LoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//print num till 10 
		
		int num=1;
		while(num <=10){
			System.out.println(num);
			num++;
			
		}
		
		System.out.println("******************************************************");		
		
		//if we need to execute atleast ones even if condition is false we use do while.
		
		int num1=22;
		do {
			System.out.println(num1);
			num1++;
		}while(num1<=10);
		
		System.out.println("******************************************************");		
		
		//for loop
		for(int i=2;i<=10;i++){
			System.out.println(i);
		}
		System.out.println("******************************************************");
		
		//factorial example do later
		
		
		
		 
		//for each loop--->
		
		String hobbies="speeding;Other";
		String[] arrHobbies = hobbies.split(";");
		for(int i=0;i<arrHobbies.length;i++) {
			System.out.println("Using for loop:" +arrHobbies[i]);
		}
		
		//for each
		for(String str:arrHobbies) {
			System.out.println("Using for loop:" +str);
		}
	}

}
