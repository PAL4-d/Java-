package learn.java编程基础;

public class shuzuzuizhihuoqu {
    public static void main(String[] args) {
        int [] arr = {22,24,76,12,21,33};
        // 定义一个数组
        int max = getMax(arr);
        // 调用获取数组最大值的方法
        System.out.println("max="+max);
        // 打印最大值
    }
    static int getMax (int []arr){
        int max = arr[0];
        // 定义变量max用于记住最大数，首先假设第一个元素为最大值
        // 使用for循环遍历数组的元素
        for (int x = 1; x < arr.length;x++){
            if (arr[x] > max){
            // 比较arr[x]的值是否大于max
                max = arr[x];
                // 条件成立，将arr[x]的值赋给max
            }
        }
        return max;
        // 返回最大值
    }
}
