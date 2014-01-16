package myobj;

import java.util.Arrays;
import java.util.Scanner;

public class Obj08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("请输入需要加密的数据：");
		try {
			String str =new Scanner(System.in).nextLine();
			//转型成字符数组
			char data[]=str.toCharArray();
			//1 逆序
			char t;
			for (int i = 0,j=data.length-1; i < j; i++,j--) {
				t=data[i];
				data[i]=data[j];
				data[j]=t;
			}
			//2 替换
			for (int i = 0; i < data.length; i++) {
				int n=data[i]-48;
				char c=(char) ((n+5)%10+48);
				data[i]=c;
			}
			//3 首位交换
			t=data[0];
			data[0]=data[data.length-1];
			data[data.length-1]=t;
			
			System.out.println("加密后的数据是 "+new String(data));
		} catch (Exception e) {
			System.out.println("输入有误，程序无法完成转换。");
		}
		
	}

}
