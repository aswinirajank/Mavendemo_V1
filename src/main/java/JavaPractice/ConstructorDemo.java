package JavaPractice;

public class ConstructorDemo {

	String DBserverURL = "url.com";
	String DBname;
	String UserName;
	String Password;

	// Create constructor. Name same as Class and no return type.
	public ConstructorDemo(String name, String uName, String pass) {
		System.out.println("Constructor initialize");
		DBname = name;
		UserName = uName;
		Password = pass;
	}

	// Default constructor.Dont have to create this explicitly
	public ConstructorDemo() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void readTableData1() {
		/*
		 * String DBserverURL= "url.com"; String DBname= "dbName1"; String UserName =
		 * "user1"; String Password ="pass1";
		 */

		System.out.println(
				"Started reading data from table:" + DBserverURL + " " + DBname + " " + UserName + " " + Password);
	}

	/*
	 * public void readTableData2(){ String DBserverURL= "url.com"; String DBname=
	 * "dbName2"; String UserName = "user2"; String Password ="pass2";
	 * System.out.println("Started reading data from table:"+DBserverURL + " "
	 * +DBname + " " +UserName +"" +Password); }
	 */

	public void connecttoDB() {
		System.out.println("Connecting to DB");
	}

	
}
