import java.util.Scanner;

public class Alex_Goes_Shopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//No. of items
    int n = sc.nextInt();
    //Price of each items in the shop
		int[] price = new int[n];
		for (int i = 0; i < price.length; i++) {
			price[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		while (q-- > 0) {
      //amount alex has 
			int A = sc.nextInt();
      //minimum required number of choce
			int k = sc.nextInt();
			if(ispossible(price, A, k)==true) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}

		}

	}
	//Requirement -  to find if there are k number of items which can be purchased with A amount of money where whole amount A can be spent in purchasing
  //a particular item.
  //If A amount can be utilized completely to buy an item having price p any number of times then A % p==0.
  //Count the number of items for which A % p == 0 and if it is greater than or equal to k then return true/yes.
	public static boolean ispossible(int []price, int A, int k) {
		int count=0;
		for (int i = 0; i < price.length; i++) {
			if(A%price[i]==0) {
				count++;
			}
		}
		if(count>=k) {
			return true;
		}
		else {
			return false;
		}
	}

}
//https://hack.codingblocks.com/app/contests/3504/1094/problem
