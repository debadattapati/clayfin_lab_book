import java.util.Scanner;
public class GetInputs
{
   public static void main(String args[])
   {
       String first_name;
       String last_name;
       String gender;
      int age;
      int weight;
      
      Scanner obj = new Scanner(System.in); 
 
      System.out.println("Enter First Name:");
     first_name = obj.nextLine(); 
      
 
      System.out.println("Enter Last Name:");
      last_name = obj.nextLine(); 
    
      System.out.println("Enter Gender   M/F:");
      gender = obj.nextLine(); 
 
      System.out.println("Enter age:");
      age = obj.nextInt(); 
      
      System.out.println("Enter weight:");
      weight = obj.nextInt(); 
      
     System.out.println("Person Details:"); 
     System.out.println("................"); 
     System.out.println("First Name:"+first_name); 
     System.out.println("Last Name:"+last_name); 
     System.out.println("Gender"+gender); 
     System.out.println("Age:"+age); 
     System.out.println("Weight:"+weight); 
   }
}