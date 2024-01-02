import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {3,5,1,2,34,23,7,89,0,4};
		System.out.println("Before : ");
		System.out.println(Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("After : ");
		System.out.println(Arrays.toString(arr));
	}

	private static void selectionSort(int[] arr) {
		int n = arr.length-1;
		for(int i =0;i<n;i++) {
			int min_ind = i;
			for(int j = i+1;j<n;j++) {
				if(arr[j]<arr[min_ind]) {
					min_ind = j;
				}
			}
			int temp = arr[min_ind];
			arr[min_ind] = arr[i];
			arr[i] = temp;
		}
	}

}
