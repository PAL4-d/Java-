package learn.java编程基础;

public class fangfachongzai {

    public static void main(String[]args){
            //下面是针对求和方法的调用
            int sum1 = add(1,2);
            int sum2 = add(1,2,3);
            double sum3 = add(1.2,1.3);
        //下面的代码时打印求和的结果
            System.out.println("sum1=" + sum1);
            System.out.println("sum2=" + sum2);
            System.out.println("sum3=" + sum3);
    }
    //下面是三个同名但是参数不同的方法，根据参数的不同可以
    //自动选择适合同名不同参数的方法
    public static int add (int x, int y){
        return x + y;
    }
    public static int add (int x, int y,int z){
        return x + y + z;
    }
    public static double add (double x,double y){
        return x + y;
    }
}
