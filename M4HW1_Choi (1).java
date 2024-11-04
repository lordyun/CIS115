/**
 * M4HW1_Choi
 * 
 * Michael Choi
 * M4HW1
 * 10-4-24
 * This program collects input about the widget sales of the user and computes the user's monthly salary
 * 
 */
import java.util.Scanner;

 public class M4HW1_Choi 
{

    public static void main(String[] args) 
    {   
        String name;
        int widgetsSold, widgetsReturned, netWidgetsSold;
        double widgetSalesAmount, commissionAmount, commissionRate, monthSalary;
        final double WIDGET_PRICE = 4.79, BASE_SALARY = 2000.00;
        Scanner k = new Scanner (System.in);

        System.out.print("Enter your name: ");
        name = k.nextLine();
        System.out.print("Enter the amount of widgets sold this month: ");
        widgetsSold = k.nextInt();
        System.out.print("Enter the amount of widgets returned this month: ");
        widgetsReturned = k.nextInt();

        netWidgetsSold = widgetsSold - widgetsReturned;
       
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

        System.out.println("Sales Person: " + name);
        System.out.println("Net Widgets Sold: " + netWidgetsSold);
        System.out.println("Widget Sales Amount: $" + widgetSalesAmount);
        System.out.println("Commissions Amount: $" + commissionAmount);
        System.out.println("Monthly Salary: $" + monthSalary);

        k.close();

    }
}