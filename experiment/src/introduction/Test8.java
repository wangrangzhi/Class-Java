package introduction;

import java.util.Scanner;

public class Test8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("输入 华氏温度：");
		try {
			float f =new Scanner(System.in).nextFloat();
			float c=9.0f/5*(f-32);
			System.out.println("转换后的摄氏温度是 "+c);
		} catch (Exception e) {
			System.out.println("输入温度的值即可。");
		}
	}

}
