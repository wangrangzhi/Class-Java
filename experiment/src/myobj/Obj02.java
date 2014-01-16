package myobj;

import java.util.Calendar;
import java.util.Scanner;

public class Obj02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int y,m,d;
		System.out.println("输入年、月、日：");
		Scanner s=new Scanner(System.in);
		y=s.nextInt();
		m=s.nextInt();
		d=s.nextInt();
		Calendar c =Calendar.getInstance();
		c.set(y, m-1, d);
		System.out.println("是本年中的第"+c.get(Calendar.DAY_OF_YEAR)+"天");
	}

}
