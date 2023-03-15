package Act4;
import java.util.Scanner;
public class Act4_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String accords[] ={"first","second","third","forth","fifth"}; 
        int[] numbers = new int[5];
        
        System.out.println("Enter five numbers");
        for (int i = 0; i < 5; i++) {
        	System.out.print("Enter "+ accords[i] +" numbers: ");
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4-i; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int item = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = item;
                }
            }
        }
        // display ascending order
        System.out.print("Sorted numbers in ascending order: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }

        // display descending order
        System.out.print("\nSorted numbers in descending order: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
	}
}


