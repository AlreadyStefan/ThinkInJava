package cn.lzu.c4;

public class Test08 {

	public static void main(String[] args) {
		for(int i=0;i<9;i++) {
			switch(i) {
			case 0: System.out.println("星期日");//break;
			case 1: System.out.println("星期一");break;
			case 2: System.out.println("星期二");break;
			case 3: System.out.println("星期三");break;
			case 4: System.out.println("星期四");break;
			case 5: System.out.println("星期五");break;
			case 6: System.out.println("星期六");break;
			default:System.out.println("错误");break;
			}
		}

	}

}
