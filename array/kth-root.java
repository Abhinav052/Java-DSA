import java.util.Scanner;

public class Kth_Root {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextLong();
			int k = sc.nextInt();
			System.out.println(kthroot(n, k));

		}

	}

	public static long kthroot(long n, int k) {

		long lo = 1;
		long hi = n;
		long ans = 0;
		while (lo <= hi) {
			long mid = lo + (hi - lo) / 2;
      //Objective- to return the largest number x such that x raised to the power k (x^k) is less than or equal(<=) to the given number n. 
      //If mid^k is less than the provided number then we store it as potential answer and try to maximize the answer till the condition is false.
			if (Math.pow(mid, k) <= n) {
				ans = mid;
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return ans;

	}

}

//https://hack.codingblocks.com/app/contests/3504/43/problem
