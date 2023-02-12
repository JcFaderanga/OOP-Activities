import java.util.Scanner;
public class HelloWorld{

     public static void main(String []args){
         Scanner inputs = new Scanner(System.in);
         System.out.print("Enter 1st number: ");
         int firstnum = inputs.nextInt();
         System.out.print("Enter 2nd number: ");
         int secondnum = inputs.nextInt();
         
     /* A. display binary*/
     System.out.println(firstnum +" = "+ Integer.toBinaryString(firstnum));
     System.out.println(secondnum +" = "+ Integer.toBinaryString(secondnum));
     
     /* B. Add and display binary*/
      int sum = firstnum + secondnum;
      
      System.out.println(sum + " = " +Integer.toBinaryString(sum));
     }
}