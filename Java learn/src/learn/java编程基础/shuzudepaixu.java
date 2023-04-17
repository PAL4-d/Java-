package learn.java编程基础;

import javax.print.event.PrintEvent;

public class shuzudepaixu {
    public static void main(String[] args) {
        int [] arr = {9,234,3,88,622};
        System.out.println("冒泡排序前：");
        printArray(arr);                          //打印数组元素
        bubbleSort(arr);                          //调用排序方法
        System.out.println("冒泡排序后：");      
        printArray(arr);                          //打印数组元素
    }
    public static void printArray (int [] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i] + "");      //打印元素和空格
        }
        System.out.println("\n");
    }
    public static void bubbleSort (int [] arr){
        for (int i = 0;i < arr.length -1; i++){
            for (int j =0;j < arr.length - i - 1; j++){
                if (arr[j] > arr[j+1]){           //比较相邻元素
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("第" + (i+1) + "轮排序后：");
            printArray(arr);                      //每轮比较结束后打印数组元素
        }
    }
}
