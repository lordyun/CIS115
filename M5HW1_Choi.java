// Michael Choi
// M5HW1
// 10-29-24
// This program allows the user to average any number of grades they want, while ensuring the grades are wihtin the range 0-100. It then displays the user's letter grade.

import java.util.Scanner;

public class M5HW1_Choi
 {
    public static void main(String[] args)
    {
        int grades, count = 1, value, total = 0;
        String answer = "Yes";
        Scanner k = new Scanner(System.in);
       
        while(answer.equalsIgnoreCase( "yes"))
            {
                count = 1;
                total = 0;
                System.out.print("How many grades would you like to average? ");
                grades = k.nextInt();
            do 
            {
                System.out.print("Enter grade " + count + ": ");
                value = k.nextInt();
                
                while (value < 0 || value > 100)
                {
                    System.out.print("Invalid entry. Please enter a grade in the range of 0-100: ");
                    value = k.nextInt(); 
                }
                
                total += value;
                count++;
            } 
            while (count <= grades);

            double average;
            average = total / grades;
        
            char grade;
                if (average >= 90)
                    {
                        grade = 'A';
                    }
                else if (average >= 80)
                    {
                        grade = 'B';
                    }
                else if (average >= 70)
                    {
                        grade = 'C';
                    }
                else if (average >= 60)
                    {
                        grade = 'D';
                    }
                else
                    {
                        grade = 'F';
                    }
            
            System.out.println("Grade is " + grade);


            System.out.print("Do you want to run the program again? Answer 'Yes' or 'No': ");
            answer = k.next();
            }
        System.out.println("The program has exited.");

        k.close();
    }
}