package cn.lzu.c4;

public class Test09 {

	public static void main(String[] args) {
		Test09 f = new Test09();
//		int k = Integer.parseInt(args[0]);
		int k = 5;
		System.out.println(k+"---");
		for(int i=0;i<k;i++)
			System.out.println(f.fib(i));
		}
	int fib(int n) {
		if(n<2) return 1;
		return (fib(n-2)+fib(n-1));

	}

}
