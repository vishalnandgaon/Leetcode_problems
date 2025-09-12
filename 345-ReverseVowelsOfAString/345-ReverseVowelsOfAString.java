// Last updated: 12/09/2025, 06:41:17
class Solution {
    public boolean isvowel(char c){
        return "AEIOUaeiou".indexOf(c) !=-1;
    }
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int left=0;
        int right=arr.length-1;

        while(left<right){
            while(left<right && !isvowel(arr[left])){
                left++;
            }
            while(left<right && !isvowel(arr[right])){
                right--;
            }

            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
        return new String(arr);   
    }
}