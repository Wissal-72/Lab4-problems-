package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of salespeople to be displayed : ");
        final int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);

        // Modifications :

        // 1.1
        System.out.printf("\nAverage sales : %.2f $", ((float)sum)/SALESPEOPLE );


        // 1.2
        int i =1;
        int i_max = 0;
        while (i< sales.length){
            if(sales[i]> sales[i_max]) i_max = i;
            i++;
        }
        System.out.println("Maximum Sales : "+ sales[i_max]+ "$ [salesperson :"+(i_max+1)+ " ]");


        // 1.3
        i=1;
        int i_min= 0;
        while (i< sales.length){
            if(sales[i]< sales[i_min]) i_min = i;
            i++;
        }
        System.out.println("Minimum Sales : "+ sales[i_min]+ "$ [salesperson :"+ (i_min+1)+ " ]");

        //1.4
        System.out.print("Enter a threshold for sales : ");
        int  threshold = scan.nextInt() ;

        System.out.println("Salespeople with sales exceeding the threshold "+ threshold+ "$ :");

        int num_exceeds = 0;
        for (i=0 ; i< sales.length; i++ ){
            if(sales[i]>= threshold){
                System.out.println("Salesperson "+ (i +1)+ " with sales "+ sales[i]+ "$");
                num_exceeds++;
            }
        }
        System.out.println("Total Salespeople with sales exceeding the threshold :"+ num_exceeds);

        //1.5
        /*
        we keep the same program and print i+1 instead of i the index of the sales table
        */

        //1.6
        // we modify the variable SALESPEOPLE to become an input value
    }
}