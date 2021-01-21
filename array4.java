package arrays;

public class array4 {
	
	public static void ascarray(int[] array) {
		int temp;
		int size = array.length;
		
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(array[i]>array[j]) {
					temp = array[i];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
	}
	
	public static void printarray(int[] array) {
		int size = array.length;
		for(int i=0;i<size;i++) {
			System.out.println(array[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarray = {0,1,0,1,2,2,0,1,0};
		ascarray(myarray);
		printarray(myarray);
	}

}
