class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = "";
        for(int i = 0; i < myString.length(); i++){
            char ch = myString.charAt(i);
            if(ch == 'A'){
                str += "B";
            }else{
                str += "A";
            }
            answer = (str.contains(pat))? 1 : 0;
        }
        return answer;
    }
}