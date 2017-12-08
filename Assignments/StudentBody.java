package Assignments;

//********************************************************************
//  StudentBody.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of an aggregate class.
//********************************************************************

public class StudentBody 
{
   //-----------------------------------------------------------------
   //  Creates some Address and Student objects and prints them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Address school = new Address ("800 Lancaster Ave.", "Villanova",
                                    "PA", 19085);

      Address jHome = new Address ("21 Jump Street", "Lynchburg","VA", 24551);
      
      Address jbrotherHome = new Address(jHome);
      Student john = new Student ("John", "Gomez", jHome, school);
      Student jon = new Student ("John", "Gomez", jHome, school, 81, 23, 47);

      Address mHome = new Address ("123 Main Street", "Euclid", "OH",
                                   44132);
      Student marsha = new Student ("Marsha", "Jones", mHome, school);

      System.out.println (john.equals(jon));
      System.out.println ();
      System.out.println (jon);
   }
}
