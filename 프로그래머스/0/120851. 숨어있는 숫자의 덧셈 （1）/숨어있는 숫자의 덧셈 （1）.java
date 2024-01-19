class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++){
            int ch = my_string.charAt(i);
            if(ch >= 48 && ch <= 57){
                answer += ch - 48;
            }
        }
        return answer;
    }
}