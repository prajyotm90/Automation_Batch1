package Assignment1;

public class OutputQ13 {
	public static void main(String[] args) {
		OutputQ13 qq=new OutputQ13();
		qq.value();
		int i = 2;
		while (makeDecision(i)) {

			i = i * i;
			System.out.println(i);
		}

	}
	
	public static void value() {
		System.out.println("Value of 2 mod 3 is: "+2%3);
		System.out.println("Value of 4 mod 3 is: "+4%3);
		System.out.println("Value of 16 mod 3 is "+16%3);
		System.out.println("Value of 256 mod 3 is: "+256%3);
		System.out.println("Value of 65536 mod 3 is: "+65536%3);
		System.out.println("Value is: "+131072%3);
	}

	public static boolean makeDecision(int i) {
		if (i % 3 != 0) {
			return true;
		} else {
			return false;
		}
	}
	

}
