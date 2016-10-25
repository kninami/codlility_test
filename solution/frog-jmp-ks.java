class Solution {
    public int solution(int X, int Y, int D) {
        int result =(int)Math.ceil((double)(Y-X)/D);
        return result;
    }
}