package introduction;

import java.util.Scanner;

public class Test6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("输入一个算式：");
		try {
			String s =new Scanner(System.in).nextLine();
			String []data=s.split("[\\+\\-\\*\\/]");
			float n1=Float.parseFloat(data[0]);
			float n2=Float.parseFloat(data[1]);
			float sum=0;
			if(s.contains("+")){
				sum=n1+n2;
			}else if(s.contains("-")){
				sum=n1-n2;
			}else if(s.contains("*")){
				sum=n1*n2;
			}else if(s.contains("/")){
				sum=n1/n2;
			}
			System.out.println("结果是："+sum);
		} catch (NumberFormatException e) {
			System.out.println("输入算式，形如：34+67" );
		}
		
	}

}
