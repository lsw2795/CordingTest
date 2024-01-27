class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        int aLength = intervals[0][1] - intervals[0][0] + 1; 
        int bLength = intervals[1][1] - intervals[1][0] + 1; 
        answer = new int [aLength + bLength];
        
        int index = 0;
        
        for(int i = intervals[0][0]; i <= intervals[0][1]; i++){
            answer[index++] = arr[i];
        }
        
        for(int i = intervals[1][0]; i <= intervals[1][1]; i++){
            answer[index++] = arr[i];
        }
        
        return answer;
    }
}