class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for(int i = 1; i < numLog.length; i++){
             if(1 == numLog[i] - numLog[i - 1]){
                 answer += "w";
             } else if(-1 == numLog[i] - numLog[i - 1]){
                 answer += "s";
             } else if(10 == numLog[i] - numLog[i - 1]){
                 answer += "d";
             } else if(-10 == numLog[i] - numLog[i - 1]){
                 answer += "a";
             }
        }
        
        return answer;
    }
}