package functional;

public class Function12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=1,b=1,c;
		System.out.print(a+","+b+",");
		while(true){
			a=a+b;
			b=a+b;
			if(a>55 || b>55)break;
			System.out.print(a+","+b+",");
		}
	}

}
