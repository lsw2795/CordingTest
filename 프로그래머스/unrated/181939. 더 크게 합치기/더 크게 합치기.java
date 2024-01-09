class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String res1 = Integer.toString(a) + Integer.toString(b);
        String res2 = Integer.toString(b) + Integer.toString(a);

        int result1 = Integer.valueOf(res1);
        int result2 = Integer.valueOf(res2);

        answer = (result1 > result2)? result1 : result2;
        return answer;
    }
}