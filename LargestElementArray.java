package dsa;
import java.util.*;
public class LargestElementArray {
	static int findMax(int arr[],int n) {
		int max=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Largest element in the array: "+findMax(arr,n));
	
	sc.close();
	
}
}
