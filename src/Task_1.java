import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int k = sc.nextInt();
		int[] array = new int[length];
		
		for (int i=0; i < length; i++) {
			array[i] = sc.nextInt();
		}
		
		int[] result = new int[length];
		
		for (int i = 0; i < k; i++) {
			result[length - k + i] = array[i];
		}
		for (int i = k; i < length; i++) {
			result[i - k] = array[i];
		}
		
		System.out.println(Arrays.toString(result));
	}

}
