class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int res1 = 0;
        int res2 = 0;

        for (int i = 0; i < num_list.length; i++){
            if(i % 2 == 0){
                res1 += num_list[i];
            }else {
                res2 += num_list[i];
            }
        }
        System.out.println("res1 = " + res1 + ", res2 = " + res2);
        answer = Math.max(res1, res2);
        return answer;
    }
}