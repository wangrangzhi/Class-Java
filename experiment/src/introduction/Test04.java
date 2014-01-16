package introduction;

import java.util.Scanner;

public class Test04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("输入一个浮点数：");
		
		try {
			String s = new Scanner(System.in).nextLine();
			String s1=s.substring(0, s.indexOf("."));
			String s2=s.substring(s.indexOf(".")+1, s.length());
			System.out.println("整数是 "+s1+" 小数部分是"+s2);
		} catch (Exception e) {
			System.out.println("请输入浮点数据！不知道啥是浮点数据，找百度！");
		}
	}

}
