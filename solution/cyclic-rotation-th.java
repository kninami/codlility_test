class Solution {
	public int[] solution(int[] A, int K) {
		int[] result = new int[A.length];
		int length = 0;
		
		if(K!=0 && A.length!=0){ length = K%A.length; }
		for(int i=0;i<A.length;i++){
			if(i+length<A.length){  
				result[i+length] = A[i]; 
			}else{
				result[i+length-A.length] = A[i];
			}
		}

		return result;
	}
}
