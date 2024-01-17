class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        int index = str2.indexOf(str1);
        answer = (index != -1)? 1 : 0;
        return answer;
    }
}