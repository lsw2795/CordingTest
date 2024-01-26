import java.util.*;

class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i <my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(Character.isDigit(ch)){
                 list.add(Character.getNumericValue(ch));
            }
        }
        
        Collections.sort(list);
        
        return list;
    }
}