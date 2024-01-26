import java.util.*;

class Solution {
    public List<Integer> solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        while(n != 1 && n > 0){
            list.add(n);
            
            if(n % 2 == 0){
                n /= 2;
            }else{
                n = n * 3 + 1;
            }
        }
        
        list.add(1);
        
        return list;
    }
}