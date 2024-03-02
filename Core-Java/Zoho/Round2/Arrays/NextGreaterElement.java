package Zoho.Round2.Arrays;
import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] array = {6, 3, 9, 10, 8, 2, 1, 15, 7};
        int[] result = findNextGreaterElements(array);
        for (int i : result) {
            if (i == -1) {
                System.out.print("_ ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
    static int[] findNextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        res[n-1]=-1;
        st.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && arr[i]>=st.peek()){
                st.pop();
            }
            res[i]=st.isEmpty()?-1:st.peek();
            st.push(arr[i]);
        }
        
        return res;
    }
}
