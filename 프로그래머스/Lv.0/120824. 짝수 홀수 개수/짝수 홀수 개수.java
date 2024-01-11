class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer = new int[2];
        int count = 0;
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                count++;
            }
        }
        
        answer[0] = count;
        answer[1] = num_list.length - count;
        
        return answer;
    }
}