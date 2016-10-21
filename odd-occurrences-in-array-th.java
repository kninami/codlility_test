import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

class Solution {
    public int solution(int[] A) {
    		int result=0;
    		HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
    		
    		for(int i=0;i<A.length;i++){
    			int key = A[i];
    			if(map.containsKey(key)){
    				map.put(key,map.get(key) + 1);
    			}else{
    				map.put(key,1);
    			}
    		}
    		
    		Iterator iterator = map.entrySet().iterator();
				
				while (iterator.hasNext()) {
   				Entry entry = (Entry)iterator.next();
						if(((int)entry.getValue()%2)==1){
							result = (int)entry.getKey();
						}
  			}
  			 	
  			return result;
   }
}