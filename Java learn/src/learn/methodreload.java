package learn;

public class methodreload {
    public static void main(String[] args) {
        // 下面是针对求和方法的调用
        int sum1 = add(1, 2);
        int sum2 = add(1, 2,3);
        int sum3 = add(1.2, 2.3);

        System.out.println("sum1="+sum1);
        System.out.println("sum2="+sum2);
        System.out.println("sum3="+sum3);
    }
    public static int add (int x, int y){
        return x + y;
    }
    public static int add (int x, int y, int z){
        return x + y + z;
    }
    public static int add (double x, double y){
        return (int) (x + y);

    }
}
