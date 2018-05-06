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

		for (int i = 2; i < length; i++) {
			if (array[i] < 0) {
				array[i] = 2 * array[i - 1] - array[i - 2];
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
