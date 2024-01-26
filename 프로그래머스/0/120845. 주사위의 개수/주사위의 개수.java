import java.util.Arrays;

class Solution {
    public int solution(int[] box, int n) {
        int dice = 0;
        Arrays.sort(box);
        dice = (box[0] / n) * (box[1] / n) * (box[2] / n);
        
        return dice; 
    }
}