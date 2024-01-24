class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i = 0; i < cipher.length(); i++){
            char ch = cipher.charAt(i);
            if((i+1) % code == 0){
                answer += "" + ch;
            }
        } 
        
        return answer;
    }
}