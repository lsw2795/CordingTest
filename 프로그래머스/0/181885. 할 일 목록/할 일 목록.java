class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        int count = 0;
        
        for(int i = 0; i < finished.length; i++){
            if(finished[i] == false){
                count++;
            }
        }
        
        answer = new String[count];
        count = 0;
        
        for(int i = 0; i < finished.length; i++){
            if(finished[i] == false){
                answer[count++] = todo_list[i];
            }
        }
        
        return answer;
    }
}