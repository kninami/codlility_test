import java.util.ArrayList;

class Solution{
    public int solution(int N){
        ArrayList<Integer> array = new ArrayList<Integer>();
        
        int count = 0;
        int max = 0;
        boolean flag = false;
        
        //generate binary number
        while(N>0){
            array.add(N%2);
            N = N/2;
        }
        
        //count zero number
        for(int i = array.size()-1; i>=0; i--){
            if(array.get(i) == 1){
                if(flag){
                    if(count > max){
                        max = count;
                    }
                    count = 0;
                }else{   //first 1 appears
                    count = 0;
                    flag  = true;
                }
            }else{
                count ++;
            }
        }
        
        return max;
        
    }
}