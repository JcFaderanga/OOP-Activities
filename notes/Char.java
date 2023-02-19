import java.util.Scanner;
public class myApp{
   public static void main(String [] args){
       //Initialization
      //char ch='\0';
      Scanner sc= new Scanner(System.in);
       for (char ch = 'A'; ch<='Z'; ch++){
         System.out.println("Equivalent char: "+ ch);
         if(ch=='E'){
            break;
         }
      }
   }
}