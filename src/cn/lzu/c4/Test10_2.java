package cn.lzu.c4;

import java.util.Arrays;

/**
 * 打印四位数的吸血鬼数字
 * @author Stefan
 *
 */
public class Test10_2 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<100;i++) {
			for(int j=i+1;j<100;j++) {
				if(i*j>1000) {
					
					String mul = i*j+"";
					String ad  = i + "" + j ;
					if(equal(mul,ad)) {
						System.out.println(i*j+"="+i+"*"+j);
					}
				}
			}
		}
	}

	private static boolean equal(String mul, String ad) {
		char[] mul1 = mul.toCharArray();
		char[] ad1 = ad.toCharArray();
//		String[] mul1 = mul.split(",");
//		String[] ad1 = ad.split(",");
		
		Arrays.sort(mul1);
		Arrays.sort(ad1);
		if(Arrays.equals(mul1, ad1))
			return true;
		return false;
		
	}
	
}
