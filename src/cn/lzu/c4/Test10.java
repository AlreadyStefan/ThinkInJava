package cn.lzu.c4;


public class Test10 {
	static int a(int i) {
//		a=i/1000 a1=i%1000;
//		b=a1/100 b1=a1%100;
		return i/1000;
		
	}
	
	static int b(int i) {
		return (i%1000)/100;
	}
	
	static int c(int i) {
		return ((i%1000)%100)/10;
	}
	
	static int d(int i) {
		return ((i%1000)%100)%10;
	}
	
	static int add(int k,int l) {
		return (k*10+l);
	}
	
	
	static  void vampire(int i,int m,int n,int bool) {
		if(i==m*n) {
			 bool = 1;
		}

	}
	
	
	
	static  void pan(int i) {
		int  bool = 0;
		vampire(i,add(a(i),b(i)),add(c(i),d(i)),bool);
		vampire(i,add(a(i),b(i)),add(d(i),c(i)),bool);
		vampire(i,add(b(i),a(i)),add(c(i),d(i)),bool);
		vampire(i,add(b(i),a(i)),add(d(i),c(i)),bool);
		vampire(i,add(a(i),c(i)),add(b(i),d(i)),bool);
		vampire(i,add(a(i),c(i)),add(d(i),b(i)),bool);
		vampire(i,add(c(i),a(i)),add(b(i),d(i)),bool);
		vampire(i,add(c(i),a(i)),add(d(i),b(i)),bool);
		vampire(i,add(d(i),a(i)),add(b(i),c(i)),bool);
		vampire(i,add(d(i),a(i)),add(c(i),b(i)),bool);
		vampire(i,add(a(i),d(i)),add(b(i),c(i)),bool);
		vampire(i,add(a(i),d(i)),add(c(i),b(i)),bool);
		
		if(bool == 1) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		for(int i=1001;i<9999;i++) {
			pan(i);
		}
		
	}
}
