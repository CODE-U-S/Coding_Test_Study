import java.util.*;

class Solution {
    boolean solution(String s) {
        Queue<String> parenth = new LinkedList<>();
        
        for(int i = 0; i < s.length(); i++){
            try{
                if(s.charAt(i) == '('){
                    parenth.add("(");
                }else{
                    parenth.remove();
                }
            }catch(NoSuchElementException e){
                return false;
            }
        }//for
        
        return parenth.isEmpty() ? true : false;
    }
}

// 시간복잡도 예상 : O(n). 왜냐하면 s길이 만큼만 반복하였기 때문이다.
