// Last updated: 09/09/2026, 16:08:52
class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> list=new ArrayList<>();

        for(int i=0;i<queries.length;i++){
            for(int j=0;j<dictionary.length;j++){
                int count=0;
                for(int k=0;k<queries[i].length();k++){
                    if(count>2) break;
                    if(queries[i].charAt(k)!=dictionary[j].charAt(k)){
                        count++;
                    }
                }
                if(count<=2){
                    list.add(queries[i]);
                    break;
                }
            }
        }
        return list;  
    }
}