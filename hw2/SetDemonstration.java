// This small demonstration program shows how to use the IntArraysSet class

import java.util.Scanner;

public class SetDemonstration
{
   private static Scanner stdin = new Scanner(System.in);

   public static void main(String[ ] args)
   {
      IntArraySet ages = new IntArraySet( );

      getAges(ages);
      checkAges(ages);
      System.out.println("May your family live long and prosper.");
   }

   // The getAges method prompts the user to type in the ages of family
   // members. These ages are read and placed in the ages set, stopping when
   // the user types a negative number. This simple demonstration does not
   // worry about the possibility of running out of memory.
   public static void getAges(IntArraySet ages)
   {
      int userInput; // An age from the user's family

      System.out.println("Type the ages of your family members.");
      System.out.println("Type a negative number at the end and press return.");
      userInput = stdin.nextInt( );
      while (userInput >= 0)
      {
         ages.add(userInput);
         userInput = stdin.nextInt( );
      }
   }


   // The checkAges method prompts the user to type in the ages of family
   // members once again. Each age is removed from the ages set when it is
   // typed, stopping when the bag is empty (or the user types a negative
   // number).
   public static void checkAges(IntArraySet ages)
   {
      int userInput; // An age from the user's family

      System.out.print("Type those ages again. ");
      System.out.println("Press return after each age.");
      while (ages.size( ) > 0)
      {
         System.out.print("Age: ");
         userInput = stdin.nextInt( );
         if ( !ages.contains(userInput) )
         {
            System.out.println("No, that age does not occur!");
         }
         else
         {
            System.out.println("Yes, I've got that age and will remove it.");
            ages.remove(userInput);
         }
      }
   }

}//SetDemonstration