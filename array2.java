package arrays;

public class array2 {
	
	public static void reversearray(int[] array, int start, int end) {
		int temp;
		
		while (start < end) {
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start ++;
			end --;
			
		}
	}
	
	public static void printarray(int[] array, int start) {
		for (int i = array.length; i <= start; i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		int[] array1 = {'1','5','8','9','6','3','5'};
		reversearray(array1,0,6);
		printarray(array1,0);

	}

}
