import java.util.Scanner;

public class Decision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = 7;

        if (a > 0) {
            if (a > 1000) {
                System.out.println("a minlik ededdir");
            } else if (a > 100) System.out.println("a yuzluk ededdir");


            System.out.println("Eded musbetdir");
        } else if (a < 0)
            System.out.println("Eded menfidir");
        else
            System.out.println("Ne musbetdir ne menfi");
        System.out.println("Bura hemise ishleyecek");
        String str = a > 0 ? String.valueOf(17) : "eded menfidir";

    }
}
