package cn.lzu.c4;


import java.util.Arrays;
 
public class Ex10_4 {
	public static void main(String[] args) {
//		long start = System.currentTimeMillis();
//		int k = 1;
        for(int i = 1; i < 100; i++){
            for(int j = i + 1; j < 100; j++){
                //�Ƚ�������λ������һ����������˺�Ľ���Ƿ����
                if(i * j > 1000){
                    String a = i + "" + j;
                    String b = i * j + "";
                    if(equal(a, b)) {
                        System.out.println(/*"��" + k + "�飺" +*/ i + " * " + j + " = " + (i * j));
//                        k++;
                    }
                }
            }
        }
//        long end = System.currentTimeMillis();
//        System.out.println("����ִ����" + (end - start) + "ms.");
    }
 
    //�ж������ַ��������������Ƿ�һ��
    private static boolean equal(String a, String b) {
        //������
        char[] as = a.toCharArray();
        char[] bs = b.toCharArray();
        Arrays.sort(as); //����
        Arrays.sort(bs); //����
        if(Arrays.equals(as, bs))
            return true;      
        return false;
    }
}