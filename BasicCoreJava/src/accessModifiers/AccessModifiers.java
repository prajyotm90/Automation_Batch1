package accessModifiers;

public class AccessModifiers {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers obj=new AccessModifiers();
		obj.publicFunction();
		obj.privateFunction();
		obj.defaultFunction();
		obj.protectedFunction();

		

	}
	
	//public, private, protected, No access Mod/Default
		
	//public--> can be accessed throughout the project
	//Class Y ||  Package Y  || Project  Y
	
	//private--> can be accessed only with in the class
	//Class  Y ||  Package N  || Project N
	
	
	//default--> can be accessed within the package
	//Class  Y ||  Package Y  || Project N
	
	
	//protected--> can be accessed within the package &- 
	//can be accessed outside the package by using child class object.
	//Class Y ||  Package Y  || Project N*
	
	
	
	
	public void publicFunction() {
		System.out.println("public function");
	}
	private void privateFunction() {
		System.out.println("private function");
	}
	void defaultFunction() {
		System.out.println("No access modifiers function");
	}

	protected void protectedFunction() {
		System.out.println("protected access modifiers");
	}
}
