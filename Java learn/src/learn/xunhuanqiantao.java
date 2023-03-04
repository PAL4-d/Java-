package learn;

public class xunhuanqiantao {
    public static void main(String[]args){
        // for (初始化表达式;循环条件;操作表达式){
        //     for(初始化表达式;循环条件;操作表达式){
        //         执行语句
        //     }
        // }
        int i,j;
        for(i = 1;i <= 9;i++){
            for(j = 1;j <= i;j++){
                System.out.println("*");
            }
            System.out.println("\n");
        }
    }
}
