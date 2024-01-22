class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        answer = new int[num_list.length];
        
        for(int i = 0; i < num_list.length - n; i++){
            answer[i] = num_list[n + i];
        }
        
        for(int i = 0; i < n; i++){
            answer[num_list.length - n + i] = num_list[i];
        }
        return answer;
    }
}