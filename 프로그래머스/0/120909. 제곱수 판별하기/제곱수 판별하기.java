class Solution {
    public int solution(int n) {
        int answer = 2;
        double squareRoot = Math.sqrt(n);
        
        if(squareRoot == Math.floor(squareRoot)){
            answer = 1;
        }
        
        return answer;
    }
}