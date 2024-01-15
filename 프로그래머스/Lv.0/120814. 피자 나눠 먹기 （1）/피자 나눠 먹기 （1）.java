class Solution {
    public int solution(int n) {
        int answer = 0;
        int slice = 7;
        
        if(n % 7 == 0){
            answer = n / 7;
        }else{
            answer = n / 7 + 1;
        }
        
        return answer;
    }
}