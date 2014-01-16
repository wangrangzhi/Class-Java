package functional;

import java.util.Arrays;
import java.util.Scanner;

public class Function01 {

	/**
	 * @param args
	 * 语法基础第 1 题
	 */
	public static void main(String[] args) {
		System.out.println("输入三个整数：");
		int arr[]=new int[3];
		try {
			Scanner s=new Scanner(System.in);
			arr[0]=s.nextInt();
			arr[1]=s.nextInt();
			arr[2]=s.nextInt();
			Arrays.sort(arr);
			System.out.println("最大值是 "+arr[2]);
		} catch (Exception e) {
			System.out.println("三个数！");
		}
		
	}

}
