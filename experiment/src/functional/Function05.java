package functional;

import java.util.Scanner;

public class Function05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[]=new int[10];
		System.out.println("输入10个数");
		Scanner s=new Scanner(System.in);
		try {
			for (int i = 0; i < arr.length; i++) {
				arr[i]=s.nextInt();
			}
			System.out.println("逆序输出：");
			for (int i = arr.length-1; i>=0; i--) {
				System.out.print(arr[i]+"\t");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
