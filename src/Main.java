import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        double sum = 0;
        int counter = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("We will compute temperature for 7 days");
        for(int i = 0; i<7; i++)
        {
            System.out.println("Enter temperate for day: "+ (i+1));
            double next = keyboard.nextDouble();
            sum = sum + next;
            counter++;

        }

        System.out.println("Average is given below: ");
        write(sum/7);
        System.out.println();
        System.out.println("Counter: "+ counter);
    }
    public static void write(double amount)
    {
        int allCents =(int)Math.round(amount*100);
        int dollars = allCents/100;
        int cents = allCents%100;
        System.out.print(dollars);
        System.out.print(".");
        if(cents<10)
        {
            System.out.print(0);
            System.out.print(cents);
        }
        else
            System.out.print(cents);

    }
}
