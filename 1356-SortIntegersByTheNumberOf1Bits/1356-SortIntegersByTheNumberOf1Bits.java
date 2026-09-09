// Last updated: 09/09/2026, 16:19:15
import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        
        Integer[] temp = new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        
        Arrays.sort(temp, (a, b) -> {
            int a1 = Integer.bitCount(a);
            int b1 = Integer.bitCount(b);
            
            if(a1 == b1){
                return a - b;   // smaller number first
            }
            return a1 - b1;     // smaller bit count first
        });
        
        for(int i=0;i<arr.length;i++){
            arr[i] = temp[i];
        }
        
        return arr;
    }
}