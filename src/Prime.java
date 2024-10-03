import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String str = i!=2 & i%2==0
                | i!=3 & i%3==0
                | i%4==0
                | i!=5 & i%5==0
                | i%6==0
                | i!=7 & i%7==0
                | i%8==0
                | i%9==0?"Murekkebdir":"Sadedir";
        System.out.println(str);
    }
}
