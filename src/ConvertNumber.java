import java.util.Scanner;

public class ConvertNumber {
    public static void main(String[] args) {
        System.out.println("Bes reqemli eded daxil edin:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int i1 = i/1 % 10; //5
        int i2=i/10%10; //8
        int i3=i/100%10; //7
        int i4=i/1000%10; //4
        int i5=i/10000%10; //1
        System.out.println(i1*10000+i2*1000+i3*100+i4*10+i5*1);
    }
}
