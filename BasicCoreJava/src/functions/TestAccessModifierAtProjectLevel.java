package functions;

import accessModifiers.AccessModifiers;

public class TestAccessModifierAtProjectLevel extends AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers obj = new AccessModifiers();
		obj.publicFunction();

		// To access protected function we need to create object of child class
		// hence create object of TestAccessModifierAtProjectLevel
		TestAccessModifierAtProjectLevel projobj = new TestAccessModifierAtProjectLevel();
		projobj.protectedFunction();

	}

}
