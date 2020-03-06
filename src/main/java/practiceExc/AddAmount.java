package practiceExc;

public class AddAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddAmount total = new AddAmount();
		AddAmount totalmore = new AddAmount(35);
	}

	int amount=50;
	
	public AddAmount() {
		printAmount();
	}
   public AddAmount(int moreamount) {
	amount= amount+moreamount;
	printAmount();
	}

   public void printAmount() {
	   System.out.println("Total in piggy bank:"+amount);
   }
}
