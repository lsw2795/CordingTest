class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        int count = 0;
        
        for(int i = 0; i < strArr.length; i++){
            if(!strArr[i].contains("ad")){
                count++;
            }
        }
        
        answer = new String[count];
        count = 0;
        
        for(String str : strArr){
            if(!str.contains("ad")){
               answer[count++] = str;
            }
        }
        
        return answer;
    }
}