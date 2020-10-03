package exceptionHandling;

public class FinallyKeyword {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try {
			System.out.println(a/b);
		}
		finally {//Executes in both cases
			System.out.println("Finally");
		}

	}

}
