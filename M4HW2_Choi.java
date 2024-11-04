/**
 * M4HW2_Choi
 * 
 * Michael Choi
 * M4HW2
 * 10-8-24
 * This program evaluates if the user is eligible to vote
 */

import java.util.Scanner;
 public class M4HW2_Choi 
{
    public static void main(String[] args) 
    {
        boolean citizen, county, age, felony;
        Scanner k = new Scanner (System.in);

        System.out.print("Are you a United States citizen? Answer 'True' or 'False': ");
        citizen = k.nextBoolean();
        System.out.print("Have you lived in the county where you are registering for a minimum of 30 days? Answer 'True' or 'False': ");
        county = k.nextBoolean();
        System.out.print("Will you be 18 or older by the date of the general election? Answer 'True' or 'False': ");
        age = k.nextBoolean();
        System.out.print("Are you serving a felony sentence or on probation? Answer 'True' or 'False': ");
        felony = k.nextBoolean();

        
        if (!citizen)
        System.out.println("You are ineligible to vote because you are not a United States citizen.");
        else if (!county)
        System.out.println("You are ineligible to vote because you have not lived in the county where you are registering for a minimum of 30 days.");
        else if (!age)
        System.out.println("You are ineligible to vote because you are under 18.");
        else if (felony)
        System.out.println("You are ineligible to vote because you are serving a felony sentence or are on probation.");
        else
        System.out.println("You are eligible to vote!");
        
        k.close();
    }
}
