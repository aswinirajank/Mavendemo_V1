package JavaPractice;

public class readDBData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		//Passing acual values through constructor.
		ConstructorDemo db1 = new ConstructorDemo("DBname1","User1","Pass1");
     // db1.readTableData1();
    //  db1.readTableData2();
		db1.connecttoDB();
		db1.readTableData1();
     
      System.out.println("************************************************");
		ConstructorDemo db2 = new ConstructorDemo("DBname2","User2","Pass2");
		db1.connecttoDB();
		db2.readTableData1();
	}

}
