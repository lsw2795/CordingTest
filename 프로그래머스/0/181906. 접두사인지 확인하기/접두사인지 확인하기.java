class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int index = my_string.indexOf(is_prefix);
        if(index == 0){
            answer = 1;
        }
        return answer;
    }
}