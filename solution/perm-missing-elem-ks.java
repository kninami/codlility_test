class Solution {
    public int solution(int[] A) {
        long N = A.length +1;
        long totalSum = (N*(N+1))/2;
        
        for(int i=0; i<A.length; i++){
            totalSum -= A[i];
        }
        
        return (int)totalSum;
    }
}