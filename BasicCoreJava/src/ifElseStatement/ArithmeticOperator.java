// No 3

package ifElseStatement;

public class ArithmeticOperator {
//+ - * / %
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		//% mod operator gives us reminder
		System.out.println("mod is"+b%a);
		
		//+ --> Addition, Concatination
		String name="Anand";
		String surname="Bhayre";
		
		System.out.println(name+surname); //AnandBhayre
		System.out.println(a+name+b); //10Anand20
		System.out.println(a+b+name); //30Anand
		System.out.println(name+a+b);  //Anand1020 -->here concatination is applied hence result is String+int=String 
		System.out.println(name+(a+b)); //Anand30
		
	}

}
