import java.util.Scanner;

public class Calculate_The_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
    //No. of operations
		int q = sc.nextInt();
		while (q-- > 0) {
      //Value of each operation
			int x = sc.nextInt();
			int[] brr = new int[n];
			for (int i = 0; i < arr.length; i++) {
        //Finding the desired index of the element to be added
				int j = i - x;
        //Moving x times in anticlockwise is same as moving length-x in clockwise direction. Therefore correction negative index to positive.
				if (j < 0) {
					j = j + n;
				}
        //temporary array with new values
				brr[i] = arr[i] + arr[j];

			}
      //main array updated with new values
			arr = brr;

		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		sum = sum % 1000000007;
		System.out.println(sum);

	}

}

//Input Format
// 5    number of elements in the circular array
// 1 2 3 4 5 elements of the circular array
// 2  number of operations to be performed
// 1  value for operation 1
// 0  value for operation 2

//Objective-
// For the given circular array perform the required operation given number of times.
//Operation description- for each operation value x : add element at i-x to each element at position i provided the array is circular. after each operation the main 
//                       array is updated with the new values and updated values are used to perform subsequent operations.

//https://hack.codingblocks.com/app/contests/3504/61/problem
