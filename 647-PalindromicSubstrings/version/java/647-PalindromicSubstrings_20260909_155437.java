// Last updated: 09/09/2026, 15:54:37
1class Solution {
2    public int countSubstrings(String s) {
3        char[] arr=s.toCharArray();
4        int n=arr.length;
5        int count=0;
6        // odd length substrings leraha hun
7        for(int i=0;i<n;i++){
8            int left=i;
9            int right=i;
10            while(left>=0 && right<n){
11                if(arr[left]!=arr[right]){
12                    break;
13                }
14                count++;
15                left--;
16                right++;
17            }
18
19        }
20
21        // even length ke lie check karunga ab
22        for(int i=0;i<n-1;i++){
23            int left=i;
24            int right=i+1;
25            while(left>=0 && right<n){
26                if(arr[left]!=arr[right]){
27                    break;
28                }
29                count++;
30                left--;
31                right++;
32            }
33        }
34        return count;
35    }
36}