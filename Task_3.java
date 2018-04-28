import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] array = new int[length];
		
		for (int i = 0; i < length; i++) {
			array[i] = sc.nextInt();
		}
		
		boolean rangeIsOpen = false;
		boolean singleElement = false;
		for (int i = 0; i < length - 1; i++) {
			if (!rangeIsOpen){
				System.out.print("[" + array[i]);
				rangeIsOpen = true;
				singleElement = true;
			}
			if (array[i + 1] - array[i] == 1) {
				singleElement = false;
				continue;
			} else {
				if (!singleElement) {
					System.out.print(" " + array[i]);
				}
				System.out.print("]");
				rangeIsOpen = false;
				singleElement = false;
			}
		}
		if (rangeIsOpen) {
			System.out.print(" " + array[length - 1] + "]");
		} else {
			System.out.print("[" + array[length - 1] + "]");
		}
	}

}
