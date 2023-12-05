import java.util.Scanner;
public class UserInput 
{
  public static void main(String[] args) 
  {
    try (Scanner scan = new Scanner(System.in)) {
      System.out.println("Enter The Age: ");
      int age=scan.nextInt();
      System.out.println("Enter Avg: ");
      double avg=scan.nextDouble();
      System.out.println("Enter You'r Name: ");
      String name=scan.next();
      
      System.out.println("your Age is " + age);
      System.out.println("Avg is " + avg);
      System.out.println("You'r Name is " + name);
    }
  }  
}