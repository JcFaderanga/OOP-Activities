package Act4;

public class act4 {

	public static void main(String[] args) {
		char[] ch = {'D', 'Z', 'H', 'Y', 'X', 'V', 'W'};
		
        // Bubble Sort
        for (int i = 0; i < ch.length-1; i++) {
            for (int j = 0; j < ch.length-i-1; j++) {
                if (ch[j] > ch[j+1]) {

                    char x = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = x;
                }
            }
        }
        //display output
        System.out.print("Sorted array: ");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i] + " ");
        }
	}
}
