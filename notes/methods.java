import java.util.Scanner;
public class nested {
    public static int num1, num2, sum, total=0;
    public static void main(String [] args) {
        try (Scanner scan = new Scanner(System.in)) {
            char ch;
            while(true){
                System.out.println("Enter number 1: ");
                num1=scan.nextInt();
                System.out.println("Enter number 2: ");
                num2=scan.nextInt();
                Sum(num1, num2);
                total+=sum;
                System.out.print("Continue [Y/N]?");
                ch=scan.next().charAt(0);
                if(ch=='N'||ch=='n'){
                    System.out.println("The total is: "+total);
                    break;
                }else{
                    clrScreen(); // Method call
                }

            }
        }

    }
    //Constructing void method
    public static void clrScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
    public static int Sum(int x, int y){ // method with parameters
        sum=x+y;        
        return sum;
    }
}