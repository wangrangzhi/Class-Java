package myobj;

import java.util.Scanner;

public class Obj09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String flag;
		Scanner sc =new Scanner(System.in);
		System.out.println("*********欢迎使用Mini转换器*********");
		while(true){
			System.out.println("输入天气状况的第一个字母：");
			flag=sc.nextLine();
			switch(flag.charAt(0)){
			case 'D':
				System.out.println("干燥");break;
			case 'M':
				System.out.println("潮湿");break;
			case 'H':
				System.out.println("炎热");break;
			case 'R':
				System.out.println("下雨");break;
			}
			System.out.println("继续否？（y/n）");
			flag=sc.nextLine();
			if(flag.charAt(0)=='n'){
				System.out.println("欢迎下次使用！");
				break;
			}else if(flag.charAt(0)=='y')continue;
			else 
				System.out.println("请按套路出牌！");
		}
		
	}

}
