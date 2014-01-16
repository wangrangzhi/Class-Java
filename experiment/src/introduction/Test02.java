package introduction;

import java.util.Scanner;

public class Test02 {

	/**
	 * @param args
	 * Java入门 第2题
	 */
	public static void main(String[] args) {
		int a,b,c;
		
		System.out.println("输入仨数：");
		Scanner s =new Scanner(System.in);
		//读取 控制台输入的数据数
		try {
			a=s.nextInt();
			b=s.nextInt();
			c=s.nextInt();
			System.out.println("和是 ："+(a+b+c));
		} catch (Exception e) {
			System.out.println("棒槌，让你输入仨数字，你傻呀！不知道啥是数字吗？");
		}
		
	}

}
