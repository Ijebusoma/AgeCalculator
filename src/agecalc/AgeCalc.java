package agecalc;

import java.util.Calendar;
import java.util.Scanner;

public  class AgeCalc
{
    static int year,age,month;
    static String choice;
    
    public static void Accept()
    {
        Scanner Accept = new Scanner(System.in);
        System.out.println("What year where you born?");
         year = Accept.nextInt();
         try{
             if(year < 1970)
                ; }
         
    
         catch(Exception e)
                 {
             
         
        
             
                 System.out.print("You just entered an invalid year, please try again");  
                 System.out.println("Do you want to try again[Y/N]");
                 choice = Accept.nextLine();
                 //Use switch here
                 
                 switch(choice)
                 {
                     case "Y":
                         Accept();
                         break;
                     case "N":
                         break;
                 }
             }
         //year >= 1970;
         
         //exit(0)     
       
       
       // System.out.println("You are" +Age "Years old");
    
    
         Calendar cal = Calendar.getInstance();
         int Curryear = cal.get(cal.YEAR);
          
       
        
        
        age = Curryear-year; 
        // System.out.println("You are" +age+"years old");
      //use a switch for the months to determine if the person is actually that year old 
        //System.out.println("You are\n" +age + "years old");
    }
        
    
    public static void GetMonth()
            
    { Scanner get = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
         int currmonth = cal.get(cal.MONTH);
        System.out.println("What month where you born");
          month = get.nextInt();
    
       // Calendar cal = Calendar.getInstance();
        if (month <= currmonth)
        {
            System.out.println("You are actually\n" +age +"Years old");
        }else if(month > currmonth)
        {
            System.out.println("You are almost:\n" +age+ "Year old");
        } 
         
    }
    
           
    
     
    public static void main(String[] args) {
        Scanner takein = new Scanner(System.in);
        
        AgeCalc Age = new AgeCalc();
        Age.Accept();
        
        
            

             
        
        
             
   
         
        
        
        Age.GetMonth();
        
       
    }
}


   
