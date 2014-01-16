package myobj;

public class Obj01 {

	public static void main(String[] args) {
		MyRect r1 =new MyRect(3,5);
		MyRect r2 =new MyRect(5,5);
		
		System.out.println("r1的面积"+r1.getArea() +" 是否是正方形 "+r1.isSque());
		System.out.println("r2的面积"+r2.getArea() +" 是否是正方形 "+r2.isSque());
	}

}
class MyRect{
	float a,b;

	public MyRect(float a, float b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public float getArea(){
		return a*b;
	}
	public boolean isSque(){
		return a==b?true:false;
	}
}
