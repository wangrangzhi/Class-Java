package functional;

import javax.swing.JOptionPane;

public class Function03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s;
		s=JOptionPane.showInputDialog("输入10个整数，用空格隔开！");
		try {
			String []data=s.split("[\\ \\,\\	]");
			int sum=0;
			for (int i = 0; i < data.length; i++) {
				sum+=Integer.parseInt(data[i]);
			}
			System.out.println("和是 "+sum);
		} catch (NumberFormatException e) {
			System.out.println("输入有误！");
		}
	}

}
