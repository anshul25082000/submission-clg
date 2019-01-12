import java.util.Scanner;

public class Month
{


   String monthName;
   int monthNumber;

   public void monthInput(){
   
      Scanner input=new Scanner(System.in);
      System.out.print("Please enter a Month Number:");
      monthNumber = in.nextInt();
   }
      
   public static void monthName(){
   
      if(monthName >= 1)
      {
         monthName = "January";
      }
      else if(monthName >= 2)
      {
         monthName = "February";
      }
      else if(monthName >= 3)
      {
         monthName = "March";
      }
      else if(monthName >= 4)
      {
         monthName = "April";
      }
      else if(monthName >= 5)
      {
         monthName = "May";
      }
      else if(monthName >= 6)
      {
         monthName = "June";
      }
      else if(monthName >= 7)
      {
         monthName = "July";
      }
      else if(monthName >= 8)
      {
         monthName = "August";
      }
      else if(monthName >= 9)
      {
         monthName = "September";
      }
      else if(monthName >= 10)
      {
        monthName = "October";
      }
      else if(monthName >= 11)
      {
         monthName = "November";
      }
      else
      {
         monthName = "December";
      }
   }
         
   public static void DisplayMonth()
   {
      System.out.print(" The Number of the Month you choose is" + monthName);
   }



}