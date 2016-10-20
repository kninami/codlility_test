import java.util.*;
import java.lang.*;
import java.util.Arrays;

class Solution {
    public int solution(int N) {
        int N3 = 1;
        String bina = Integer.toBinaryString(N);
        String pro[] = bina.split("0");
        int[] score = new int[pro.length];
		N = 0;   
				     
        for(int i=1; i<pro.length ;i++){
            if(pro[i].length()==0){
            	N3++;
            }else{
            	N3=1;
            }
            score[0]=N3;
            Arrays.sort(score);
            N=score[score.length - 1]; 
        }
        return N;
    }
}