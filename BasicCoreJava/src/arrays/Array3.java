package arrays;

public class Array3 {

	public static void main(String[] args) {
		String[] name=new String[3];
		name[0]="anand";
		name[1]="sanket";
		name[2]="anil";
		
		//Can we store below values in Array?
		//prajyot 32 true
		//Yes using Object---> Object is super class of all classes in java.
		//Object in oops: It is an instance of a class.
		
		Object[] obj=new Object[3];
		obj[0]="prajyot";
		obj[1]="32";
		obj[2]="true";

	}

}
