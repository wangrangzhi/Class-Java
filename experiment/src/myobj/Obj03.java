package myobj;

import java.util.Arrays;

public class Obj03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student ss[]=new Student[5];
		for (int i = 0; i < ss.length; i++) {
			ss[i]=new Student("Tom"+i,22+i);
		}
		System.out.println("5个学生信息\n"+Arrays.toString(ss));
		//计算平均年龄
		int aver=0;
		for (int i = 0; i < ss.length; i++) {
			aver+=ss[i].getAge();
		}
		System.out.println("平均年龄是 "+aver/5);
	}

}
class Student{
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}