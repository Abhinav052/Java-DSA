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
      rev(st,-1);
      System.out.println(st);
    }
    
    public static void rev(Stack<Integer> st,int n){
        if(st.size()==0){
            st.push(n);
            return;
        }
        int k =st.pop();
        rev(st,n);
        st.push(k);
    }
}
