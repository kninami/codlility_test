import java.util.stream.*;

class Solution {
    public int solution(int[] A) {
        
        int totalSum = IntStream.of(A).sum(); 
        int tempSum = 0;
        int minDiff = 0;
        
        for(int i=1; i<A.length; i++){
            
            totalSum -= A[i-1];
            tempSum += A[i-1]; 
            
            if(Math.abs(totalSum - tempSum) < minDiff || i == 1){
                minDiff = Math.abs(totalSum - tempSum);
            }
        }
        
        return minDiff;
    }
}