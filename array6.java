package arrays;

import java.util.*;

public class array6 {

	public static void union(int[] array1,int[] array2) {
	 Set<Integer> un = new HashSet<>();
	 for(int i =0;i<array1.length-1;i++) {
		 un.add(array1[i]);
	 for(i=0;i<array2.length-1;i++) {
		 un.add(array2[i]);
	 for(int ele: un) {
		 System.out.println(ele);
	 }
	 }
	 }
	}
	 public static void intersection(int[] array1,int[] array2) {
		 int i=0,j=0,m,n;
		 m = array1.length;
		 n = array2.length;
		 Set<Integer> in = new HashSet<>();
		 while(i<m || j<n) {
			 if(array1[i]<array2[j]) {
				 i++;
			 }
			 else if(array1[i]>array2[j]) {
				 j++;
			 }
			 else {
				 in.add(array1[i]);
				 i++;
				 j++;
			 }
		 }
		 for (int ele:in) {
			 System.out.println(ele);
		 }
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1,2,3,4,5,6,7};
		int[] array2 = {3,7,9,16,18};
		
		union(array1,array2);
		intersection(array1,array2);
	
		}
	}


