package stringClass;

public class Testing {

	public static void main(String[] args) {
		String name="Anand";
		
		//Function 1 length
		System.out.println(name.length());
		
		//Function 2 charAt
		System.out.println(name.charAt(3));
		
		//Function 3 equals
		String name2="AnaNd";
		System.out.println(name.equals(name2));
		//Case sensitive test Prajyot will return false and AnAnD will also return false
		
		//Function 4 equalsIgnoreCase
		System.out.println(name.equalsIgnoreCase(name2));
		
		//Function 5 trim
		System.out.println(name);
		System.out.println(name.trim());
		//removes spaces from beginning and end of string not from between of string
		
		//Function 6 toUpperCase
		System.out.println(name.toUpperCase());
		
		//Function 7 toLowerCase
		System.out.println(name.toLowerCase());
		
		
		//Function 8 subString
		System.out.println(name.substring(1));
		System.out.println(name.substring(2, 4));
		
		//Function 9 replace
		System.out.println(name.replace("n", "v"));
		
		//Function 10 Split
		String[] str=name.split("n");
		for(String s:str) {
			System.out.println(s);
		}
		
		
		//Function 11 
		
		String[] std=new String[1];
		std[0]="Anand";
		std[1]="Prajyot";
		System.out.println(std[0]);
		System.out.println(std[1]);
		
		
		
		
	}

}
