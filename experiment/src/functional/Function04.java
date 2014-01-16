package functional;

public class Function04 {

	static long fun(int n){
		if(n==1 || n==0)return 1;
		return n*fun(n-1);
	}

	public static void main(String[] args) {
		long sum=0;
		for (int i = 1; i <=15; i++) {
			sum+=fun(i);
		}
		System.out.println("结果是 "+sum);
	}

}
