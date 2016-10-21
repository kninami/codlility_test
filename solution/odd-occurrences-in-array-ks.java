import java.util.*;

class Solution {
    public int solution(int[] A) {
        
        Map<Integer,Integer> matchMap = new HashMap<Integer,Integer>();
        int unPaired = 0;
        
        for(int i=0;i<A.length;i++){
            int value = matchMap.get(A[i])==null?0:matchMap.get(A[i]);
            matchMap.put(A[i],value+1);
        }
        
        for(Map.Entry<Integer, Integer> entry : matchMap.entrySet()){
            if(entry.getValue() % 2 > 0){
                unPaired = entry.getKey();
            }
        }
        
        return unPaired;
    }
}