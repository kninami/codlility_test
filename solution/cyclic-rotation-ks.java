class Solution {
    public int[] solution(int[] A, int K) {
        int[] B = new int[A.length];
        
        for(int i=0; i<A.length; i++){
            B[(i+K)%A.length] = A[i];
        }
        
        return B;
    }
}