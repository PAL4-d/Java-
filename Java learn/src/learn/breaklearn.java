package learn;

public class breaklearn {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 4){
            System.out.print("x ="+x);
            if (x == 3){
                break;
            }
            x++;
        }
    }
}
