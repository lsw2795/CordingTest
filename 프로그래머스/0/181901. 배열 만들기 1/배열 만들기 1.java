class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        int count = 0;
        
        for(int i = k; i <= n; i += k){
            count++;
        }
        
        answer = new int[count];
        count = 0;
        
        for(int i = k; i <= n; i += k){
            answer[count++] = i;
        }
        
        return answer;
    }
}