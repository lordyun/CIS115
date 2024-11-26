import java.util.Scanner;

/**
 * M7HW1_Choi  
 */

public class M7HW1_Choi
{

    public static void main(String[] args) 
    {
        runProgram();

    }
    public static void runProgram()
    {
        Scanner in = new Scanner(System.in);
        String keep_going = "yes";
        while(keep_going.equalsIgnoreCase("yes"))
            {
                displayInfo();
                int total = getSales();
                int widgetsReturned = getReturns();
                int netWidgetsSold = calWidSold(total, widgetsReturned);
                double widgetSalesAmount = calWidSalesAmt(netWidgetsSold);
                double commissionAmount = calComm(widgetSalesAmount);
                double monthSalary = calSalary(commissionAmount);
                displayValues(total, widgetsReturned, netWidgetsSold, widgetSalesAmount, commissionAmount, monthSalary);
                // all calls to your function/methods should come from runProgram()  method only
                System.out.println();
                System.out.print("Do you want to run the program again? Enter yes or no: ");
                keep_going = in.next();
                System.out.println();
            }
    in.close();
    System.out.println("Program has terminated!");
    }
    public static void displayInfo()
    {
        System.out.println();
        System.out.println("Michael Choi");
        System.out.println();
        System.out.println("This program collects input about the widget sales of the user and computes the user's monthly salary. ");
        System.out.println();
        

    }
    // create your functions/methods here
    public static int getSales()
    {
        int total = 0, count;
        Scanner k = new Scanner ( System.in );
        for (count = 1; count < 5; count++)
        { 
            System.out.print("Enter the amount of widgets sold in week " + count + ": ");
            int week = k.nextInt();
            total += week;
        }
        return total;
    }
    public static int getReturns()
    {
        int total = 0, count;
        Scanner k = new Scanner ( System.in );
        for (count = 1; count < 5; count++)
        {
            System.out.print("Enter the amount of widgets returned in week " + count + ": ");
            int week = k.nextInt();
            total += week;
        }
        return total;
    }
    public static int calWidSold(int x , int y)
    { 
        int net;
        net = x - y;
        return net;
    }
    public static double calWidSalesAmt(int x)
    {
        double price = 4.79, widgetSalesAmount;
        widgetSalesAmount = x * price;
        return widgetSalesAmount;
    }
    public static double calComm(double x)
    {
        double commissionRate;
        if (x >= 0 && x <= 100)
        {
        commissionRate = 0.1;
        }
    else if (x> 100 && x < 200)
        {
        commissionRate = 0.15;
        }
    else if (x >= 200 && x < 300)
        {
        commissionRate = 0.2;
        } 
    else
        {
        commissionRate = 0.25;
        }   
    
    
    double commissionAmount = commissionRate * x;
    return commissionAmount;
    }
    public static double calSalary(double x)
    {
        double baseSalary = 2000.00, monthSalary;
        monthSalary = baseSalary + x;
        return monthSalary;
    }
    public static void displayValues(int a, int b, int c, double d, double e, double f)
    {
        System.out.println("Sales Person: Michael Choi\n");
        System.out.println("Month #1:" + "\n");
        System.out.println("Widgets Sold: " + a + "\n");
        System.out.println("Widgets Returned: " + b + "\n");
        System.out.println("Net Widgets Sold: " + c + "\n");
        System.out.println("Widget Sales Amount: $" + String.format("%.2f", d) + "\n");
        System.out.println("Commissions Amount: $" + String.format("%.2f", e) + "\n");
        System.out.println("Monthly Salary: $" + String.format("%.2f", f) + "\n");
        System.out.println();
    }
}