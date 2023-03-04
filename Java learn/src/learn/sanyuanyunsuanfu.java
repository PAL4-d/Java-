package learn;

public class sanyuanyunsuanfu {
    private static int max;

    public static void main(String[]args){
        // 判断条件 ? 表达式1:表达式2
        int x = 0;
        int y = 1;
        max = x > y? x : y;
        System.out.println(max);
    }
}
