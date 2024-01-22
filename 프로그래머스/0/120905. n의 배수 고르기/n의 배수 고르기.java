class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int count = 0;
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                count++;
            }
        }
        
        answer = new int[count];
        count = 0;
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                answer[count++] = numlist[i];
            }
        }
        
        return answer;
    }
}