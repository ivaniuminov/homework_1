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

//		First solution - Array copy
		
//		int[] result = new int[length];
//		System.arraycopy(array, 0, result, length - k, k);
//		System.arraycopy(array, k, result, 0, length - k);
//		System.out.println(Arrays.toString(result));
		
//		Second solution Inner loop
		
		int temp;
		for (int i=0; i < k; i++) {
			temp = array[0];
			for (int j = 1; j < length; j++) {
				array[j - 1] = array[j];
			}
			array[length - 1] = temp;
		}
		System.out.println(Arrays.toString(array));
	}

}
