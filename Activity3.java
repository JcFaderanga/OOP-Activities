import java.util.Scanner;
//Constructor
class CAKE{
    double subTotal;
    String condition;
    double totalCost;
    CAKE(double subTotal, String condition, double totalCost){
        this.totalCost = totalCost;
        this.subTotal = subTotal;
        this.condition = condition;
        if(condition.equals("N")){
            System.out.println("TOTAL COST: "+ totalCost);
        }
    }
}
class DRINKS{
    double subTotal;
    String condition;
    double totalCost;
    DRINKS(double subTotal, String condition, double totalCost){
        this.totalCost = totalCost;
        this.subTotal = subTotal;
        this.condition = condition;
        if(condition.equals("N")){
            System.out.println("TOTAL COST: "+ totalCost);
        }
    }
}
//Methods
public class practice {
   static void cakeList(){
        System.out.println("    FLAVORED CUP CAKES    ");
        System.out.println("Flavor                Cost");
        System.out.println("[A] Chocolate        25.00");
        System.out.println("[B] Raisins          50.00");
        System.out.println("[C] Pineapple        40.00");
        System.out.println("[D] Apple            30.00");
        System.out.println("[E] Mango            35.00");
        System.out.println("[F] Banana           45.00");
   }
   static void drinkList(){
        System.out.println("      GLASS OF DRINKS     ");
        System.out.println("Flavor                Cost");
        System.out.println("[1] Softdrinks       25.00");
        System.out.println("[2] Iced Tea         50.00");
        System.out.println("[3] Coffee           40.00");
        System.out.println("[4] Apple Juice      30.00");
        System.out.println("[5] Mango Juice      35.00");
        System.out.println("[6] Pineapple juice  45.00");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalCost = 0;
        double totalCostDrinks = 0;
       while(true){
        double cakePrice = 0;
        cakeList();
        System.out.print("CHOOSE FLAVOR: ");
        char cakeFlavor = input.next().charAt(0);
        switch(cakeFlavor){
        case 'A': case 'a': cakePrice = 25.00; break;
        case 'B': case 'b': cakePrice = 50.00; break;
        case 'C': case 'c': cakePrice = 40.00; break;
        case 'D': case 'd': cakePrice = 30.00; break;
        case 'E': case 'e': cakePrice = 35.00; break;
        case 'F': case 'f': cakePrice = 45.00; break;
        default:
             break;
       }
        System.out.print("QUANTITY: ");
        int quantity = input.nextInt();
        double subTotal = cakePrice * quantity;
        System.out.println("SUBTOTAL: "+ subTotal);
        totalCost += subTotal;
        System.out.print("ANOTHER [Y/N]");
        String condition= input.next().toUpperCase();
        new CAKE(cakePrice,condition,totalCost);
        if(condition.equals("N")){
            break;
        }
    }
    while(true){
        double drinkPrice = 0;
        drinkList();
        System.out.print("CHOOSE FLAVOR: ");
        int flavor = input.nextInt();
        switch(flavor){
        case 1: drinkPrice = 25.00; break;
        case 2: drinkPrice = 50.00; break;
        case 3: drinkPrice = 40.00; break;
        case 4: drinkPrice = 30.00; break;
        case 5: drinkPrice = 35.00; break;
        case 6: drinkPrice = 45.00; break;
        default:
        break;
        }
        System.out.print("QUANTITY: ");
        int quantity = input.nextInt();
        double subTotal = drinkPrice * quantity;
        System.out.println("SUBTOTAL: "+ subTotal);
        totalCostDrinks += subTotal;
        System.out.print("ANOTHER [Y/N]");
        String condition= input.next().toUpperCase();
        new DRINKS(drinkPrice,condition,totalCostDrinks);
        if(condition.equals("N")){
            break;
        }
    }
      System.out.println("-------------------------------------");
      System.out.println("               SUMMARY               ");
      System.out.println("-------------------------------------");
      System.out.println("FOOD: "+ totalCost);
      System.out.println("DRINKS: "+ totalCostDrinks);
      System.out.println("-------------------------------------");
      System.out.println("AMOUNT DUE: "+(totalCost+totalCostDrinks));
  }
}
