import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle");
        int width = sc.nextInt();
        System.out.println("Enter the height of the rectangle");
        int height = sc.nextInt();
        System.out.println("Area: " + (width * height));
        System.out.println("Perimeter: " + ":"  + 2 * (width + height));
    }
}
