package oops.inheritance;

public class User {
	public static void main(String[] args) {

		Telephone phone1 = new Telephone();
		phone1.calling();

		Mobile phone2 = new Mobile();
		phone2.texting();
		phone2.calling();

		Smartphone phone3 = new Smartphone();
		phone3.videoCalling();
		phone3.texting();
		phone3.calling();
	}

}
