// Last updated: 02/10/2025, 10:55:25
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        if(s.length()<p.length()) return list; 
        int n=p.length();
        int[] arr=new int[26];
        for(int i=0;i<n;i++){
            arr[p.charAt(i)-'a']++;
        }
        int window=n;
        int[] brr=new int[26];
        for(int i=0;i<window;i++){
            brr[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(arr,brr)) list.add(0);

        for(int i=window;i<s.length();i++){
            brr[s.charAt(i)-'a']++;
            brr[s.charAt(i-window)-'a']--;

            if(Arrays.equals(arr,brr)){
                list.add(i-window+1);
            }
        }
        return list;
    }
}