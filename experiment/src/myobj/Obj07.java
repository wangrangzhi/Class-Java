package myobj;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 练习 Calendar 类的使用
 * */
public class Obj07 {
	public static void main(String[] args) {
		int y,m,d;
		System.out.println("输入年月：");
		Scanner sc =new Scanner(System.in);
		try {
			y=sc.nextInt();
			m=sc.nextInt();
			
			Calendar c =Calendar.getInstance();
			c.set(y, m-1,1);//把日期设定为 输入日期
			String wk[]={"日","一","二","三","四","五","六"};
			int md[]={31,28,31,30,31,30,31,31,30,31,30,31};
			//如果闰年，修改二月份天数
			if(y%4==0&&y%100!=0 || y%400==0)md[1]=29;
			
			//输出日历头
			for (int i = 0; i < wk.length; i++) {
				System.out.print(wk[i]+"\t");
			}
			System.out.println();
			int fd=c.get(Calendar.DAY_OF_WEEK);
			//打印空行
			for (int i = 0; i < fd-1; i++) {
				System.out.print("\t");
			}
			for (int i = 0; i <md[c.get(Calendar.MONTH)]; i++) {
				System.out.print(i+1+"\t");
				if( (i+fd)%7==0)
					System.out.println();
			}
			
		} catch (Exception e) {
			System.out.println("程序有误，请检查输入数据的合法性！");
		}
	}
}
