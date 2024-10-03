import java.util.Scanner;

public class SwitchDecision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eded daxil edin: ");
        int a = scanner.nextInt();
        // String str = "Gulnar" str.length>10
        switch (a) {
            case 17:
                System.out.println("Eded 17-dir");
            default:
                System.out.println("Eded shertleri odemir");
            case 18:
                System.out.println("Eded 18-dir");
            case -18:
                System.out.println("Eded -18-dir");
        }
        System.out.println("Bura hemise ishleyecek");
    }
}
