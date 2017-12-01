package Assignments;

//********************************************************************
//  Student.java       Author: Lewis/Loftus/Cocking
//
//  Represents a college student.
//********************************************************************

public class Student
{
   private String firstName, lastName;
   private Address homeAddress, schoolAddress;
   private int test_1, test_2, test_3, score; 
   //-----------------------------------------------------------------
   //  Sets up this Student object with the specified initial values.
   //-----------------------------------------------------------------
   public Student (String first, String last, Address home, Address school, int score1, int score2, int score3)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = new Address ("440 West Aurora Ave","Naperville","IL",60540);
      
      test_1 = score1;
      test_2 = score2;
      test_3 = score3;
   }
   public Student (String first, String last, Address home, Address school)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      test_1 = 0;
      test_2 = 0;
      test_3 = 0;
   }
   public int setTestScore(int test, int score)
   {
       if (test == 1)
       {
           test_1 = score;
       }
       else if (test == 2)
       {
           test_2 = score;
       }
       else if (test == 3)
       {
           test_3 = score;
       }
       else
       {
           System.out.print("Invalid");
       }
   }
   public int getTestScore(int test)
   {
       if (test == 1)
       {
           return test_1;
       }
       else if (test == 2)
       {
           return test_2;
       }
       else if (test == 3)
       {
           return test_3;
       }
       else
       {
           System.out.print("Invalid");
           return 0;
       }
   }
   public boolean equals(Student obj2)
   {
       boolean address = homeAddress.addressEquals(obj2.homeAddress);
       boolean name = false;
       if (firstName == obj2.firstname && lastName == obj2.lastName)
           name = true;
       if (address == true && name == true)
           return true;
       return false;
   }
   //-----------------------------------------------------------------
   //  Returns this Student object as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = firstName + " " + lastName + "\n";
      result += "Home Address:\n" + homeAddress + "\n";
      result += "School Address:\n" + schoolAddress;
      result += "Score 1: " + score1 + "\n";
      result += "Score 2: " + score2 + "\n";
      result += "Score 3: " + score3 + "\n";

      return result;
   }
}
