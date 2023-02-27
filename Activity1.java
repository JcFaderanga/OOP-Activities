import java.util.Scanner;
public class HelloWorld{

     public static void main(String []args){
         Scanner inputs = new Scanner(System.in);
         System.out.print("Enter 1st number:");
         int firstnum = inputs.nextInt();
         System.out.print("Enter 2nd number:");
         int secondnum = inputs.nextInt();
         
         int sum = firstnum + secondnum;
         int sub = firstnum - secondnum;
         int times = firstnum * secondnum;
         int divide = firstnum / secondnum;
         int mod = firstnum % secondnum;
          
         /*addtion*/
         System.out.println(firstnum + " + " + secondnum +" = "+ sum); 
         /*subtruct*/
         System.out.println(firstnum + " - " + secondnum +" = "+ sub); 
         /*multiply*/
         System.out.println(firstnum + " x " + secondnum +" = "+ times); 
          /*divide*/
         System.out.println(firstnum + " / " + secondnum +" = "+ divide); 
         /*mod*/
         System.out.println(firstnum + " % " + secondnum +" = "+ mod); 
     }
}