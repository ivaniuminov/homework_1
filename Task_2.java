import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] array = new int[length];
		
		for (int i = 0; i < length; i++) {
			array[i] = sc.nextInt();
		}
		
		int increment = array[1] - array[0]; 
		for (int i = 1; i < length - 1; i++) {
			if (array[i + 1] < 0) {
				array[i + 1] = array[i] + increment;
			} else {
				if ((array[i + 1] - increment) != array[i]) {
					increment = array[i + 2] - array[i + 1];
				} 
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
