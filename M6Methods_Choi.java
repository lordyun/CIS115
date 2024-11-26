// Michael Choi
// 11-8-24
// M6CW1
// This program gives the user four options to choose from: gross pay, water bill, or commission calculator, or to exit the program

import java.util.Scanner;
public class M6Methods_Choi 
{

    public static void main(String[] args) 
    {
        runProgram();
    }
    
    public static void runProgram()
    {
        System.out.println("Method Project");
        Scanner in = new Scanner ( System.in );
        String keepGoing = "yes";
        while(keepGoing.equalsIgnoreCase("yes"))
        {
            displayMenu();
            System.out.println();
            System.out.print("Do you want to run the program again? Enter yes or no: ");
            keepGoing = in.next();
            System.out.println();
        }
        System.out.println("Program has terminated!");
    }

    public static void displayMenu()
    {
        System.out.println();
        System.out.println("Menu");
        System.out.println();
        System.out.println("1) Gross Pay Calculator: "); 
        System.out.println("2) Water Bill Calculator: "); 
        System.out.println("3) Commission Calculator: "); 
        System.out.println("4) Exit: "); 
        System.out.println(); 
        System.out.print ( "Selection: " ); 
        Scanner in = new Scanner ( System.in ); 
        switch (in.nextInt())
            {
                case 1: 
                    grossPay();
                    displayMenu();
                    break;
                case 2:
                    waterBill();
                    displayMenu(); 
                    break;
                case 3: 
                    commission();
                    displayMenu(); 
                    break;
                case 4: 
                    System.out.println(""); 
                    System.out.println ( "Exiting the program" ); 
                    break; 
                default: 
                    System.out.println("");      
                    System.out.println ( "Unrecognized option..Try again" ); 
                    System.out.println(""); 
                    displayMenu(); 
                    break;
            }
    }

    public static void grossPay() 
    { 
        System.out.println(""); 
        System.out.println(""); 
        System.out.println ( "You picked Gross Pay Calculator." ); 
        System.out.println ( "" ); 
        String name;
        double grossPay, rate, hours;
        Scanner k = new Scanner ( System.in );

        System.out.print("Enter your name: ");
        name = k.nextLine();
        System.out.print("Enter your pay rate: ");
        rate = k.nextDouble();
        System.out.print("Enter how many hours you worked: ");
        hours = k.nextDouble();

        grossPay = rate * hours;

        System.out.println("Hello " + name + "!");
        System.out.println("You worked " + hours + " hours at a rate of $" + rate + " per hour.");
        System.out.println("Your gross pay is: " + grossPay);
    }

    public static void waterBill()
    {
        System.out.println(""); 
        System.out.println(""); 
        System.out.println ( "You picked Water Bill Calculator." ); 
        System.out.println ( "" ); 
        final double GALLON = .20, BASE_FEE = 50;
        String name;
        double lastMonth, thisMonth, bill;
        Scanner k = new Scanner ( System.in );

        System.out.print("Enter your name: ");
        name = k.nextLine();
        System.out.print("Enter your water meter's reading from last month: ");
        lastMonth = k.nextDouble();
        System.out.print("Enter you water meter's reading from this month: ");
        thisMonth = k.nextDouble();

        bill = thisMonth * GALLON + BASE_FEE;

        System.out.println("Hello " + name + "!");
        System.out.println("Last month's reading was " + lastMonth + " gallons.");
        System.out.println("This month's reading was " + thisMonth + " gallons.");
        System.out.println("The charge for this month is: $" + bill + ".");
    }
    public static void commission()
    {
        System.out.println(""); 
        System.out.println(""); 
        System.out.println ( "You picked Commission Calculator." ); 
        System.out.println ( "" ); 
        String name;
        double widgetsSold, widgetsReturned, netWidgets, netSales, commission;
        final double BASE_SALARY = 500.00, WIDGET_PRICE = .10;
        Scanner k = new Scanner ( System.in );

        System.out.print("Enter your name: ");
        name = k.nextLine();
        System.out.print("Enter the amount of widgets sold this month: ");
        widgetsSold = k.nextDouble();
        System.out.print("Enter the amount of widgets returned this month: ");
        widgetsReturned = k.nextDouble();

        netWidgets = widgetsSold - widgetsReturned;
        netSales = netWidgets * WIDGET_PRICE;
        commission = netSales + BASE_SALARY;

        System.out.println("Hello " + name + "!");
        System.out.println("You sold a net of " + netWidgets + " widgets this month.");
        System.out.println("Your commission for this month was $" + commission +".");
    }
}