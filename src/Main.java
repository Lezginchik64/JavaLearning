import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("* ");
            }
            System.out.println();
        }

    /* System.out.println("Введи мне два числа и я посчитаю их сумму!");
        System.out.println("__________________________________________");



        double a=0, b=0;
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        System.out.println("Введите сюда первое число:");
        a=in.nextDouble();

        System.out.println("Введите сюда второе число:");
        b=in.nextDouble();
        
        System.out.println("Сумма ваших чисел равна:" + (a+b));
*/
    /* Scanner in = new Scanner(System.in);
         int x = in.nextInt();
         boolean a = x < 5 || x > 5 && x < 7;
         System.out.println(a);*/

        /*//Reshenie zadachi 1
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.println(x < 2 && y < x && x * x + y * y > 4 && y > 0 ? "YES" : "NO");
        */

        /*//Reshenie zadachi 2
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.println((y < 2 - x * x && y > x && x < 0) || (y < 2 - x * x && y > 0 && x >= 0) ? "YES" : "NO");*/

       /* Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1 -> System.out.println("31");
            case 2 -> System.out.println("28");
            case 3 -> System.out.println("24");
            case 4 -> System.out.println("22");
            case 5 -> System.out.println("21");
        }*/

        //blocks
        /*{
            int inf = 10;
            if (inf > 0) {
                int price = 4;
                price += inf * price / 100;
                System.out.println(price);
            }
        }*/

        // задача с автобусом
      /*  {
            Scanner in = new Scanner(System.in);
            int t = 0;
            int N = in.nextInt();
            int i = 1;
            while (i < N) {
                t = in.nextInt();
                if (t < 437) {
                    System.out.println("Crash" + i);
                    break;
                }
                i++;
            }
            if (t > 437) {
                System.out.println("No Crash");
            }*/


    }


}


