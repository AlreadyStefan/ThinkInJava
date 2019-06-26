package cn.lzu.c4;


import java.util.Arrays;
 
public class Ex10_4 {
	public static void main(String[] args) {
//		long start = System.currentTimeMillis();
//		int k = 1;
        for(int i = 1; i < 100; i++){
            for(int j = i + 1; j < 100; j++){
                //比较两个二位数合在一起与它们相乘后的结果是否相等
                if(i * j > 1000){
                    String a = i + "" + j;
                    String b = i * j + "";
                    if(equal(a, b)) {
                        System.out.println(/*"第" + k + "组：" +*/ i + " * " + j + " = " + (i * j));
//                        k++;
                    }
                }
            }
        }
//        long end = System.currentTimeMillis();
//        System.out.println("程序共执行了" + (end - start) + "ms.");
    }
 
    //判断两个字符串包含的数字是否一致
    private static boolean equal(String a, String b) {
        //先排序
        char[] as = a.toCharArray();
        char[] bs = b.toCharArray();
        Arrays.sort(as); //排序
        Arrays.sort(bs); //排序
        if(Arrays.equals(as, bs))
            return true;      
        return false;
    }
}