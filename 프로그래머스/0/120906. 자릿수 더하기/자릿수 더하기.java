class Solution {
    public int solution(int n) {
        int answer = 0;
        String strNum = String.valueOf(n);
        for(int i = 0; i < strNum.length(); i++){
            char ch = strNum.charAt(i);
            answer += ch - 48;
        }
        return answer;
    }
}