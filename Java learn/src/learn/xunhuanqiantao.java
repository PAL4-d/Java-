package learn;

public class xunhuanqiantao {
    public static void main(String[]args){
        // for (初始化表达式;循环条件;操作表达式){
        //     for(初始化表达式;循环条件;操作表达式){
        //         执行语句
        //     }
        // }
        // 第二层循环的j++可以忽略
        // int i,j;
        // for(i = 1;i <= 3;i++){
        //     for(j = 1;j <= i; j++){
        //         System.out.println(j);
        //         System.out.println("*");
        //     }
        //     System.out.println("\n");
        // }

        int x = 1;
        int y = 1;
        while(x <= 3){
            while (y <= 5){
                System.out.println("这是内层循环"+y);
                y++;
            }
            System.out.println("这是外层循环"+x);
            x++; 
        }
    }
}
