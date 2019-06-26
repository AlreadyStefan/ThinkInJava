package cn.lzu.c4;

import java.util.ArrayList;

public class Test11 {

	public static void main(String[] args) {
		ArrayList<Integer> li_s = new ArrayList();
		// TODO Auto-generated method stub
		for(int m=10;m<100;m++){
			for(int n=10;n<100;n++) {
				int mul = m*n;
				if(mul<1000) {
					continue;
				}
				String str_mul = "" + mul;
				String str_mn = "" + m + n;
				for(int i=0;i<str_mn.length();i++) {
					int index = str_mul.indexOf(str_mn.substring(i,i+1));
					if(index != -1) {
						if(index == 0) {
							str_mul = str_mul.substring(index+1, str_mul.length());
						}else {
							str_mul=str_mul.substring(0, index)+str_mul.substring(index+1,str_mul.length());
						}
						
					}
				}
				if(str_mul.length()==0) {
					boolean flag = true;
					if(li_s.size() == 0) {
						li_s.add(m*n);
						System.out.println(m*n + "=" + m + "*" + n);
					}
					for (int i = 0; i < li_s.size(); i++) {
						Integer val = li_s.get(i);
						if(m*n == val.intValue()) {
							flag = false;
						}		
					}
					if(flag) {
						li_s.add(m*n);
						System.out.println(m*n + "=" + m + "*" + n);
						break;
					}
					
				}
			}
		}
		
		
	}

}
