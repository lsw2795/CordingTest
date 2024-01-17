import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        answer = (sides[sides.length - 1] < sides[0] + sides[1])? 1 : 2;
        return answer;
    }
}