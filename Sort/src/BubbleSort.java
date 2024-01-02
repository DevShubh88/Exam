import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {3,5,1,2,34,23,7,89,0,4};
		System.out.println("Before : ");
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("After : ");
		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr) {
		int n = arr.length-1;
		for(int i =0;i<n;i++) {
			for(int j = 0;j<n-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
	}

}
