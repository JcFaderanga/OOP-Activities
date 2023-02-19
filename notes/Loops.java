import java.util.Scanner;
public class loops{
    public static int num1,num2,sum,total=0;
    public static String strSum;
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        char ch;
        
        for(int i=0;true;i++){
            clrScreen();   
            System.out.println("Enter 1st number: ");
            num1=sc.nextInt();
            System.out.println("Enter 2nd number: ");
            num2=sc.nextInt();
            Sum(num1,num2);
            total+=Integer.parseInt(strSum);
            System.out.println("Would you like to quit [Y/N]?: ");
            ch=sc.next().charAt(0);
            if(ch=='Y'||ch=='y'){
               System.out.println("Exited at this momment.");
               break;
            }
        }
        System.out.printf("\nTotal: %d", total);
    }

    public static void clrScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static String Sum(int a, int b){     
        sum=a+b;
        strSum= String.valueOf(sum);
        return strSum;
    }

}