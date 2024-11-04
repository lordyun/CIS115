/**
 * M5HW2_Choi
 * 
 * Michael Choi
 * M5HW2
 * 10-31-24
 * This program collects input about the widget sales of the user and computes the user's monthly salary
 * 
 */
import java.util.Scanner;

 public class M5HW2_Choi
{

    public static void main(String[] args) 
    {   
        String name, answer = "Yes";
        int week, total, weekReturns, widgetsReturned , netWidgetsSold, count;
        double widgetSalesAmount, commissionAmount, commissionRate, monthSalary;
        final double WIDGET_PRICE = 4.79, BASE_SALARY = 2000.00;
        Scanner k = new Scanner (System.in);

        System.out.print("Enter your name: ");
        name = k.nextLine();
        
        while(answer.equalsIgnoreCase("yes"))
        {   
            
        total = 0;
        widgetsReturned = 0;
            
        for (count = 1; count < 5; count++)
        { 
            System.out.print("Enter the amount of widgets sold in week " + count + ": ");
            week = k.nextInt();
            total += week;
        }
        for (count = 1; count < 5; count++)
        {
            System.out.print("Enter the amount of widgets returned in week " + count + ": ");
            weekReturns = k.nextInt();
            widgetsReturned += weekReturns;
        }
        
        netWidgetsSold = total - widgetsReturned;
       
        if (netWidgetsSold >= 0 && netWidgetsSold <= 100)
            {
            commissionRate = 0.1;
            }
        else if (netWidgetsSold > 100 && netWidgetsSold < 200)
            {
            commissionRate = 0.15;
            }
        else if (netWidgetsSold >= 200 && netWidgetsSold < 300)
            {
            commissionRate = 0.2;
            } 
        else
            {
            commissionRate = 0.25;
            }   
        
        widgetSalesAmount = netWidgetsSold * WIDGET_PRICE;
        commissionAmount = commissionRate * widgetSalesAmount;
        monthSalary = commissionAmount + BASE_SALARY;

        System.out.println("Sales Person: " + name + "\n");
        System.out.println("Month #1" + "\n");
        System.out.println("Widgets Sold: " + total + "\n");
        System.out.println("Widgets Returned: " + widgetsReturned + "\n");
        System.out.println("Net Widgets Sold: " + netWidgetsSold + "\n");
        System.out.println("Widget Sales Amount: $" + widgetSalesAmount + "\n");
        System.out.println("Commissions Amount: $" + commissionAmount + "\n");
        System.out.println("Monthly Salary: $" + monthSalary + "\n");
        

        System.out.print("Do you want to run the program again? Answer 'Yes' or 'No': ");
        answer = k.next();
        }
        System.out.println("The program has ended.");
        k.close();
    }
}