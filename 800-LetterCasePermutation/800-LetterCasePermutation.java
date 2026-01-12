// Last updated: 12/01/2026, 22:49:31
class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> lis=new ArrayList<>();
        backTrack(0,s.toCharArray(),lis);
        return lis;
    }


    private void backTrack(int idx,char[] arr,List<String> lis){
        if(idx==arr.length){
            lis.add(new String(arr));
            return;
        }

        if(Character.isLetter(arr[idx])){
            arr[idx]=Character.toLowerCase(arr[idx]);
            backTrack(idx+1,arr,lis);

            arr[idx]=Character.toUpperCase(arr[idx]);
            backTrack(idx+1,arr,lis);
        }
        else{
            backTrack(idx+1,arr,lis);
        }
    }
}