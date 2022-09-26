import java.util.Scanner;

public class Sorting_In_linear_time {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Sorting(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
  //For sorting array containing 3 type of elements if 2 types are placed at correct position 1 is placed correctly automatically.
  //In first case we compare for the element which is to be placed starting from the right most position. The iterator(mid in this case) is not incremented in this       //case as the value which is swapped in into mid needs to be checked.
  //In second case if we check for the element which is to be placed from the left most position and the iterator needs to be incremented as in all possible case         //iterator will be greater than the left pointer.
  //Third is the case for the type of element which will be taken care of automatically.
	public static void Sorting(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		int mid = 0;
		while (mid <= right) {
			if (arr[mid] == 2) {
				int t = arr[right];
				arr[right] = arr[mid];
				arr[mid] = t;
				right--;
			} else if (arr[mid] == 0) {
				int t = arr[left];
				arr[left] = arr[mid];
				arr[mid] = t;
				left++;
				mid++;
			} else {
				mid++;
			}
		}

	}

}


https://hack.codingblocks.com/app/contests/3504/1330/problem
