class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt("" + a + b);
        int multi = 2 * a * b;

        int answer = 0;

        if(ab > multi){
            answer = ab;
        } else if (ab == multi) {
            answer = ab;
        } else{
            answer = multi;
        }
        
        return answer;
    }
}