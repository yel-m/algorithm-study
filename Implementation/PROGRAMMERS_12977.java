import java.util.*;


public class PROGRAMMERS_12977 {
    
    
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i = 0; i < nums.length-2; i++) {
            for(int j = i+1; j < nums.length-1; j++) {
                for(int k = j+1; k < nums.length; k++) {
                    // 더할 수 있는 모든 것 더하기
                    int candidate = nums[i] + nums[j] + nums[k];
                    
                    // 소수 판정
                    if(isPrime(candidate)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    
    boolean isPrime(int candidate) {
        if(candidate == 2) return true;
        
        for(int i = 2; i < candidate-1; i++) {
            if(candidate % i == 0) { 
                return false;
            }
        }
        return true;
    }
}
    