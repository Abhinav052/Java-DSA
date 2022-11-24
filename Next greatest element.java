import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      int[] arr = {10,2,1,3,5,4,8,7};
      System.out.print(Arrays.toString(nge(arr)));
    }
    
    public static int[] nge(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<arr.length;i++){
            while(st.size() > 0 && arr[st.peek()] < arr[i]){
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while(st.size()>0)
            ans[st.pop()] = -1;
            
        return ans;
    }
}
  
