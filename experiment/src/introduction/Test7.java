package introduction;

public class Test7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j =1; j <=i; j++) {
				System.out.printf("%dx%d=%d\t",i,j,i*j);
			}
			System.out.println();
		}

	}

}
