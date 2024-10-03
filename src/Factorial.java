import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();
        int fact = 1;
        if(numb<0) {
            System.out.println("Eded menfi ola bilmez");
        }
        else if(numb==0) {
            System.out.println(1);
        }
        else {
          int i = 1;
            while(i <= numb) {
                fact = fact * i;
                i++;
            }
            System.out.println(fact);
        }
    }
}
