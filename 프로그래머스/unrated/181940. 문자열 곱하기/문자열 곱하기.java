class Solution {
    public String solution(String my_string, int k) {
        String result = "";

        for (int i = 0; i < k; i++) {
            result += my_string;
        }
        System.out.println("result = " + result);
        return result;
    }
}