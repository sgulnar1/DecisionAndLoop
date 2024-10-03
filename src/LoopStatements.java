import java.util.Scanner;

public class LoopStatements {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 != 0) {
//                continue;
//            }
//            System.out.println(i);
//        }
//        Scanner sc = new Scanner(System.in);
//        int numb = sc.nextInt();
//        for(int i=1;i<=numb;i++) {
//            for(int j=1;j<=i;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=numb;i++) {
//            for(int j=1;j<=i;j++) {
//                System.out.print(" fd gfgf");
//            }
//            System.out.println();
//        }
//
//        int i = 0;
//        while (i <= 10) {
//            i++;
//            if (i % 2 == 0)
//                continue;
//            System.out.println(i);
//            if (i == 7)
//                break;
//        }
        System.out.println("Main start");
//        if (true)
//            return;
//        else if(true) {
//            int netice = sum(5, 7);
//        }

//        System.out.println("Main end");
//        block1: {
//            System.out.println("BLOCK1 start");
//            block2:{
//                System.out.println("Block2 start");
//                if (true) break block2;
//                System.out.println("Block2 end");
//            }
//            System.out.println("BLOCK1 end");
//        }
//        int height = 7;
//        int weight = 5;
//        for (int i = 1; i <= height; i++) {
//            for (int j = 1; j <= weight; j++) {
//                if(j==1 || j==weight || Math.ceil((double) height/2) == i)
//                    System.out.print("*");
//                else
//                    System.out.print(" ");
//            }
//            System.out.println();
//        }
//        int x=0;
//        while(x<=10) {
//            System.out.print("*");
//            x++;
//            if (x == 2)
//                continue;
//        }
//
        outer:
        {
            System.out.println("Outer");
            inner:
            {
                if (true) {
                    while (true) {
                        System.out.println("*");
                    }
                }
                System.out.println("inner");
            }
            System.out.println("outer finish");
        }
        System.out.println("Bura hemishe ishleyecek");

    }

    //
    private static int sum(int a, int b) {
        int c = a + b;
        System.out.println("sum: " + c);
        return c;
    }
}
