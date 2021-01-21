package arrays;

public class array5 {
	
	public static void arrange(int[] array) {
		int size = array.length;
		for (int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if (array[j]<0) {
					int temp;
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	public static void printarray(int[] array) {
		int size = array.length;
		
		
		for(int i = 0;i<size;i++) {
			System.out.println(array[i]);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myarray = {-1,0,9,8,-1,5,2,-8,-4,0,5};
		arrange(myarray);
		printarray(myarray);
	}

}
