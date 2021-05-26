//quadratic equation

import java.util.Scanner;

class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("a = ");
        int a = sc.nextInt();
        System.out.println("b = ");
        int b = sc.nextInt();
        System.out.println("c = ");
        int c = sc.nextInt();
        sc.close();

        if (a > 0)
        {
            double D = Math.pow(b, 2) - 4 * a * c;
            System.out.print("D = " + D);
            double x1 = -b + Math.sqrt(D) / (2 * a);
            double x2 = -b - Math.sqrt(D) / (2 * a);
            System.out.println(" x1 = " + Math.round(x1) + " " + "x2 = " + Math.round(x2));
        } else if (a == 0)
        {
            double x = -b / (2 * a);
            System.out.println("x = " + Math.round(x));
        } else
        {
            System.out.println("Equation haven't root. Exit");
            System.exit(0);
        }
    }
}
