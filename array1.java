package arrays;

public class array1 {
	
	public static void reversearray(char[] arr, int start, int end) 
	{
		char temp;
		
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start ++ ;
			end --;
		}
	}
	public static void printarray(char[] arr,int size, int start)
	{
		for (int i = start; i<=size-1; i++) {
			System.out.println( arr[i] );
		}
	}
	

	public static void main(String[] args) 
	{
		char[] mainarray = {'s','h','u','b','h','a','m'};
		reversearray(mainarray,0,6);
		printarray(mainarray,7,0);
	}
}


