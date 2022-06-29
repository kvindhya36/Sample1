package Operations;

public class Addition {

	  //Method 1- using "return statement" 
		/*
		 * public static int sum=0;
		 * 
		 * public static int AddtwoNumbers(int num1,int num2) { sum=num1+num2;
		 * 
		 * return sum; }
		 * 
		 * public static void main(String[] args) {
		 * 
		 * int sum1=AddtwoNumbers(123,675); int sum2=AddtwoNumbers(126,6787);
		 * 
		 * System.out.println(sum1); System.out.println(sum2); }
		 */

//Method 2	without "return statement"
public static int sum=0;
	
	public static void AddtwoNumbers(int num1,int num2) {
		sum=num1+num2;
		System.out.println(sum);
		
	}
	
		
	public static void main(String[] args) {
		
		AddtwoNumbers(123,675);
		
	}
}
