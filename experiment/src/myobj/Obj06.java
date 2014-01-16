package myobj;

/**
 * 该类相当于 ComputeTime类
 * 用于计算 时间
 * */
public class Obj06 {

	public static void main(String[] args) {
		Common plane=new Plane();	//创建一个飞机
		Common car=new Car007();	//创建一个车
		//计算时间
		System.out.println("飞机的时间 "+1000/plane.getSpeed(10,8,2));
		System.out.println("汽车的时间 "+1000/car.getSpeed(10,8,2));
		
		//使用命令行 运行的方式
		try {
			Common common=(Common) Class.forName(args[0]).newInstance();
			int a=Integer.parseInt(args[1]);
			int b=Integer.parseInt(args[2]);
			int c=Integer.parseInt(args[3]);
			
			System.out.println("该种设备运行1000km，消耗时间："+1000/common.getSpeed(a, b, c));
			
		} catch (InstantiationException e) {
			System.out.println("实例化错误");
		} catch (IllegalAccessException e) {
			System.out.println("参数错误");
		} catch (ClassNotFoundException e) {
			System.out.println("类名输入错误");
		}catch (Exception e) {
			System.out.println("命令行运行方式  错误！");
		}
	}

}
//通用接口，获取速度
interface Common{
	public float getSpeed(float a, float b, float c);
}
class Plane implements Common{
	//飞机的速度 计算方式
	@Override
	public float getSpeed(float a, float b, float c) {
		return a*b/c;	
	}
	
}
class Car007 implements Common{
	//飞机的 速度 计算方式
	@Override
	public float getSpeed(float a, float b, float c) {
		return a+b+c;
	}
	
}
//后来又补充 其他设备
class Ship implements Common{
	@Override
	public float getSpeed(float a, float b, float c) {
		return Math.abs(a-b+c);
	}
	
}
