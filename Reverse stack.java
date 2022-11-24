import java.util.*;

public class MyClass {
    public static void main(String args[]) {
      Stack<Integer> st = new Stack<>();
      st.push(10);
      st.push(20);
      st.push(30);
      st.push(40);
      st.push(50);
      System.out.println(st);
      reverse(st);
      System.out.println(st);
    }
    
    
    
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int k = st.pop();
        reverse(st);
        insert(st,k);
    }
    
    
    public static void insert(Stack<Integer> st,int n){
        if(st.size()==0){
            st.push(n);
            return;
        }
        int k = st.pop();
        insert(st,n);
        st.push(k);
    }
}

// TIME COMPLEXITY - O(n^2)
