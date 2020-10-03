package exceptionHandling;

public class ThrowKeyword {
	public static void main(String[] args) throws InterruptedException  {
		sum(10, 20);
		//throw new Exception("Testing exception");
		temp1();
	}

	public static void sum(int a, int b) throws InterruptedException{
		System.out.println(a + b);

		Thread.sleep(2000);
	}
	
	public static void temp1() throws ArithmeticException{
		
	}

}
