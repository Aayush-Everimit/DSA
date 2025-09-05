import java.util.Scanner;


public class Factorial {
    public static long factorial(long n)
    {
        if(n > 0)
        return n* factorial(n-1);
        else return 1;
    }
    public static void  main(String []args)
    {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        long number = input.nextInt();
        if(number < 0)
        {
            System.out.println("Invalid input");
        }
        System.out.println("Factorial is " + factorial(number));
    }

}
