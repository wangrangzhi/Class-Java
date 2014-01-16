package functional;

import java.util.Scanner;

public class Function11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("输入打车公里数：");
		try {
			int n =new Scanner(System.in).nextInt();
			float m1=10,m2=8;
			if(n>3){
				m1+=(n-3)*2f;
				m2+=(n-3)*2.2f;
			}
			System.out.println("结算： 甲话费 "+m1+"\t乙话费 "+m2);
		} catch (Exception e) {
			System.out.println("输入整数");
		}
	}

}
