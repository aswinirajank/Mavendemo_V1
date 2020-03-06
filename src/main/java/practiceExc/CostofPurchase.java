package practiceExc;

import java.util.Scanner;

public class CostofPurchase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CostofPurchase obj1 = new CostofPurchase();
		obj1.getValue();
		obj1.costCheck();
	}
  
	int quantity;
	
	public void getValue() {
        Scanner input = new Scanner(System.in);
		
		System.out.print("Enter quantity of purchase");
		
		//Take input from keyboard
		quantity = input.nextInt();
		
		System.out.println("Quantity of purchase:" +quantity);
		
	}
	
	public void costCheck() {
		int unitPrice =100;
		int totalPrice = quantity*unitPrice;
		System.out.println("Total price is:" +totalPrice);
		
		if(totalPrice>1000) {
			int discount = totalPrice*10/100;
			System.out.println("Discount given" +discount);
			
			int discountedPrice= totalPrice-discount;
			System.out.println("Total price for customer is" +discountedPrice);
		}
		else {
			System.out.println("Total price for customer is" +totalPrice);
		}
		
	}
}
