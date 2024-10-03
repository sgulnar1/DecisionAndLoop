import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Enter operator: ");
        String operator = sc.next();
        String str = operator.equals("+") ?
                String.valueOf(a + b)
                : operator.equals("-")
                    ? String.valueOf(a - b)
                    : operator.equals("/")
                        ? String.valueOf(a / b)
                        : operator.equals("*")
                            ? String.valueOf(a * b)
                            : operator.equals("%")
                                ? String.valueOf(a % b)
                                : "Operatoru sehv daxil etmisiz. + - * / % ancaq bunlari daxil edin";
        System.out.println(str);
    }
}
