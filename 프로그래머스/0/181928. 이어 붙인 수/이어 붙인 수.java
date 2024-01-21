class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String sum1 = "";
        String sum2 = "";
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                sum1 += "" + num_list[i];
            }else{
                sum2 += "" + num_list[i];
            }
        }
        
        answer = Integer.parseInt(sum1) + Integer.parseInt(sum2); 
        return answer;
    }
}