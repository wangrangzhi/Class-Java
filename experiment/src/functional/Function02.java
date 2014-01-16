package functional;

import java.util.Scanner;

public class Function02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("输入一个整数：");
		try {
			int n =new Scanner(System.in).nextInt();
			System.out.println(n%2==0?"偶数":"奇数");
		} catch (Exception e) {
			System.out.println("输入整数！");
		}
	}

}
