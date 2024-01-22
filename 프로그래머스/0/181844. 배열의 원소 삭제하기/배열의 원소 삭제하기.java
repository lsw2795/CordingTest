import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            answer.add(arr[i]);
        }
        
        for(int delete : delete_list){
            int index = answer.indexOf(delete); //answer에서 delete요소가 있으면 index를 반환함

            if(index != -1){ //indexOf는 delete할 요소가 없으면 -1을 반환함
                answer.remove(index); // -1이 아니면 즉 값이 있으면 해당 인덱스 위치로 삭제
            }
        }
        
        return answer;
    }
}