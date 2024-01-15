class Solution {
    public int[] solution(int money) {
        int[] answer = {};
        answer = new int[2];
        
        int iceCoffee = 5500;
        answer[0] = money / iceCoffee;
        answer[1] = money % iceCoffee;
        
        return answer;
    }
}