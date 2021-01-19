package arrays;

import java.util.Scanner;

public class array3 {
	public static void arrange(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int temp;

				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void kmaxandmin(int[] array, int k) {
		int temp2 = array.length;
		System.out.println("The " + k + "th maximum and minimum are:" + array[k - 1] + " & " + array[temp2 - k]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the total elements of the array");
		int elesize = scan.nextInt();
		int[] myarray = new int[elesize];
		System.out.println(elesize);
		System.out.println("Enter your array");
		for (int i = 0; i < elesize; i++) {
			myarray[i] = scan.nextInt();
		}
		System.out.println("Enter your k");
		int k = scan.nextInt();
		arrange(myarray);
		kmaxandmin(myarray, k);

	}

}
