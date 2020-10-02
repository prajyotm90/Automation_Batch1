package assignment2_OOPS;

public class OutputQ2 {
	public static void main(String[] args) {
		C c = new C();
		D d = new D();

		c.parentMeth();
		//c.childMeth();

		d.childMeth();
		c.parentMeth();

	}

}

class C {

	public void parentMeth() {

	}
}

class D extends C {
	public void childMeth() {

	}

}
