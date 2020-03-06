package JavaPractice;

public class DataTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*Two data types 
		 * 1. Primitive - int, char,bool,byte,float,double,long
		 * they store single value, and store actual data and (not reference only)
		 */
		int a=10;
		int b=10;
		if(a==b) {
			System.out.println("int-true");
		}
			else {
				System.out.println("int-false");
			}
		
	     /*2 Non - primitive  
	     derived from primitive datat type,
	     stores a memory location where value is stored rather than 
	     arrays,list,classes,string*/
	
	// create a string with stringliteral
	 String str1 ="demo";
	 //another way to create a string is though new keyword
	 String str2= new String("demo");
	 
	 if(str1.equals(str2)) {
			System.out.println("string-true");
		}
			else {
				System.out.println("string-false");
			}
	}

	}


