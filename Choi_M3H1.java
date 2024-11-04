import java.util.Scanner;
 
 /**
  * Choi_M3H1
  */
 public class Choi_M3H1 
 {
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String fname, lname, course;

        System.out.println("Enter your first name: ");
        fname = keyboard.nextLine();
        System.out.println("Enter your last name: ");
        lname = keyboard.nextLine();
        System.out.println("Enter your current course: ");
        course = keyboard.nextLine();

        System.out.println("Hello, " + fname + lname + ". You are currently taking the course " + course + ".");


    }


 }
  
