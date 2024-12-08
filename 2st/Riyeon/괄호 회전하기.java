import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        for(int i=0; i<s.length(); i++)
            queue.add(s.substring(i, i+1));
        
        for(int i=0; i<s.length(); i++){
            String first = queue.poll();
            queue.add(first);
            
            Stack<String> stack = new Stack<>();
            for(int j=0; j<s.length(); j++){
                String str = queue.poll();
                queue.add(str);
                
                if(stack.isEmpty())
                    stack.push(str);
                else if(str.equals(")") && stack.peek().equals("("))
                    stack.pop();
                else if(str.equals("}") && stack.peek().equals("{"))
                    stack.pop();
                else if(str.equals("]") && stack.peek().equals("["))
                    stack.pop();
                else
                    stack.push(str);
            }
            
            if(stack.isEmpty())
                answer++;
        }
        
        return answer;
    }
}