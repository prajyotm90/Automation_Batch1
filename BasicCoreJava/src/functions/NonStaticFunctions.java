// No 18

package functions;

public class NonStaticFunctions {
	public int age=32;
	public static String name="anand";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reference                //object
		NonStaticFunctions obj=new NonStaticFunctions(); //object creation
		int add=obj.sum(10,20);
		System.out.println(obj.age);
		
		message();
		System.out.println(name);

	}
	
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public static void message() {
		
	}

}
