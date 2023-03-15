package Act4;
import java.util.*;
public class act4_3 {

	public static void main(String[] args) {
		int[] numbers = {20, 25, 75, 30, 100}; 

		Vector<Integer> vector = new Vector<Integer>();
		
		for (int i = 0; i < numbers.length; i++) {
		    vector.add(numbers[i]);
		}
		// display the vector
		System.out.println("Vector: "+vector);
	}
}
