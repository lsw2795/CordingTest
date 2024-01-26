class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        String[] arr = myString.split("x", -1);
        answer = new int[arr.length];
        
        for(int i = 0 ; i < arr.length; i++){
            answer[i] = arr[i].length();
        }
        
        return answer;
    }
}