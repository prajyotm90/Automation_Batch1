package assignment3_package;

public class OutputQ2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			int o[] = new int[2];
			o[4] = 22;
			o[1] = 33;
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("2nd pos --" +o[1]);
	}

}
