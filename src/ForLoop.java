public class ForLoop {
    public static void main(String[] args) {
        System.out.println("for");
        for (int i = 0; true; i++) {
            if (i > 10)
                break;
            System.out.println(i);
        }
        int i = 0;
        System.out.println("while");
        while (i<=10) {
            System.out.println(i);
            i++;
        }
        System.out.println("do");
        do {
            System.out.println("do: " + i);
            i++;
        } while(i<=20);
        System.out.println("after do");
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        //for(initialize;condition;update)
        System.out.println("for");
        int x = 1;
        for (; ; ) {
            if (x > 5)
                break;
            System.out.println(x);
            ++x;
        }
        ;
        System.out.println("iteration mass");
        int[] mass = {1, 2, 3, 4, 5};
        System.out.println(mass[0]);
        System.out.println(mass[1]);
        System.out.println(mass[2]);
        System.out.println(mass[3]);
        System.out.println(mass[4]);


        System.out.println("iteration mass with for");
        for (int j = 0; j < mass.length; j++) {
//            if(i==3)
//                mass[i]=15;
            mass[j] = mass[j] * mass[j];
            System.out.println(j + 1 + "-ci element: " + mass[j]);
        }
        System.out.println("iteration mass with for each");
        for (int element : mass) {
            System.out.println("before: " + element);
            element = 15;
            System.out.println("after: " + element);
        }
        System.out.println("Massiv values");
        for (int j = 0; j < mass.length; j++)
            System.out.println(mass[j]);
    }
}
