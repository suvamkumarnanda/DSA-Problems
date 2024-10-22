//find the second largest element in the array
package dsa;
import java.util.*;
public class SecondLargestInArray {
static int secondLargest(int arr[],int n) {
	int largest=0;
	for(int i=0;i<n;i++) {
		if(arr[i]>largest) {
			largest=arr[i];
		}
	}
	int sLargest=-1;
	for(int i=0;i<n;i++) {
		if(arr[i]>sLargest && arr[i]!=largest) {
			sLargest=arr[i];
		}
	}
	return sLargest;
	
	
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Second Largest Element of the array: "+secondLargest(arr,n));
	sc.close();
}
}
