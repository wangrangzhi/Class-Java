package introduction;

import java.util.Scanner;

public class Test03 {

	/**
	 * @param args
	 * 第3题
	 */
	public static void main(String[] args) {
		int a;
		
		System.out.println("输入一个数：");
		Scanner s =new Scanner(System.in);
		//读取 控制台输入的数据数
		try {
			a=s.nextInt();
			if(a>0){
				System.out.println("正数");
			}else if(a<0){
				System.out.println("负数");
			}else{
				System.out.println("0");
			}
		} catch (Exception e) {
			System.out.println("棒槌，让你输入一个数字，你傻呀！不知道啥是数字吗？");
		}
		
	}

}
