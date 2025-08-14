// Last updated: 14/08/2025, 11:35:31
class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> romanval=new HashMap<>();
        romanval.put('I',1);
        romanval.put('V',5);
        romanval.put('X',10);
        romanval.put('L',50);
        romanval.put('C',100);
        romanval.put('D',500);
        romanval.put('M',1000);
        int result =0;
        for(int i=0;i<s.length();i++){
            int currentval=romanval.get(s.charAt(i));
            if(i<s.length()-1 && currentval<romanval.get(s.charAt(i+1))){
                result-=currentval;
            }
            else{
                result+=currentval;
            }
        }
        return result;
    }
}