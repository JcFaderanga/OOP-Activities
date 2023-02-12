import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1. 100.00 per hour");
		System.out.println("2. 150.00 per hour");
		System.out.println("3. 200.00 per hour");
		
		System.out.println("===================");
		System.out.print("Enter the number you want to select: " );
		int amount = input.nextInt();
		System.out.print("Enter number of hours: ");
		double hour = input.nextDouble();
		System.out.print("Number of days taken: ");		
		double day = input.nextDouble();
		
		
		switch(amount){
		    case 1:
		    double salary1 = 100 * hour *day ;	    
		    System.out.println("Total Salary: "+salary1);
		    
		    if(salary1 <= 10000){
		        System.out.println("Tax: no tax");
		        }
		     else if(salary1 >= 10001 && salary1<= 30000){
		         
		         double tax = salary1 * .12;
		         double net = salary1- tax;
		         System.out.println("Tax: " + tax); 
		         System.out.println("Net: "+ net);  
		         }
		         else if(salary1 >= 30001 && salary1<= 50000){
		         
		         double tax = salary1 * .15;
		         double net = salary1- tax;
		         System.out.println("Tax: " + tax); 
		         System.out.println("Net: "+ net);
		         
		         }		    
		    else if(salary1 >= 50001){	         		         
		         double tax = salary1 * .25;
		         double net = salary1- tax;
		         System.out.println("Tax: " + tax); 
		         System.out.println("Net: "+ net);
		         }
		    break;
		    
		     case 2:
		    double salary2 = 150 * hour *day ;	    
		    System.out.println("Total Salary: "+salary2);
		    
		    if(salary2 <= 10000){
		        System.out.println("Tax: no tax");
		        }
		     else if(salary2  >= 10001 && salary2<= 30000){
		         
		         double tax = salary2 * .12;
		         double net = salary2 - tax;
		         System.out.println("Tax: " + tax); 
		         System.out.println("Net: "+ net);  
		         }
		         else if(salary2 >= 30001 && salary2<= 50000){
		         
		         double tax = salary2 * .15;
		         double net = salary2- tax;
		         System.out.println("Tax: " + tax); 
		         System.out.println("Net: "+ net);
		         
		         }		    
		    else if(salary2 >= 50001){	         		         
		         double tax = salary2 * .25;
		         double net = salary2- tax;
		         System.out.println("Tax: " + tax); 
		         System.out.println("Net: "+ net);
		         }
		    break;		    	           		    
		
		    
		    case 3:
		    double salary3 = 200 * hour *day ;	    
		    System.out.println("Total Salary: "+salary3);
		    
		    if(salary3 <= 10000){
		        System.out.println("Tax: no tax");
		        }
		     else if(salary3  >= 10001 && salary3<= 30000){
		         
		         double tax = salary3 * .12;
		         double net = salary3 - tax;
		         System.out.println("Tax: " + tax); 
		         System.out.println("Net: "+ net);  
		         }
		         else if(salary3 >= 30001 && salary3<= 50000){
		         
		         double tax = salary3* .15;
		         double net = salary3- tax;
		         System.out.println("Tax: " + tax); 
		         System.out.println("Net: "+ net);
		         
		         }		    
		    else if(salary3 >= 50001){	         		         
		         double tax = salary3 * .25;
		         double net = salary3 - tax;
		         System.out.println("Tax: " + tax); 
		         System.out.println("Net: "+ net);
		         }
		    break;		    
		    
		    default:
		    
		    break;	           		    
		}				
				
		
	}
}