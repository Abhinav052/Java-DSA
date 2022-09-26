public class Main {
	public static void PairofRoses(int[] arr,int amount){
		int diff = Integer.MAX_VALUE;
		int a = 0;
		int b = 0;
    //Finding all possible combinations of elements in the array
		for(int i = 0 ; i< arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
        //if sum of any two element is equal to required amount check if the difference between the two elements is minimum untill now.
        //if difference is minimum the update the pair values and the difference
        //check for each possible pair in the price array
				if(arr[i]+arr[j] == amount && diff > Math.abs(arr[i]-arr[j])){
					diff = Math.abs(arr[i]-arr[j]);
					a = arr[i];
					b = arr[j];
				}
			}
		}
  //print the price of two selected roses in increaing order.
	System.out.println("Deepak should buy roses whose prices are "+Math.min(a,b)+" and "+Math.max(a,b)+".");
	}
  
  //Start-
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
     //Input the number of text cases
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			//No of types of roses
			int[] price = new int[n];
			for (int i = 0; i < price.length; i++) {
        //Price of different types of roses
				price[i] = sc.nextInt();

			}
      //Amount to be spent
			int amount = sc.nextInt();
			PairofRoses(price,amount);

		}	
		
	}

}

// https://hack.codingblocks.com/app/contests/3504/1003/problem
