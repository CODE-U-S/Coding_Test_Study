import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        int position=5;
        int[] temp = new int[position];
        int[] answer = new int[num_list.length-position];
          for(int i = 0; i < num_list.length; i++)  {            
              if( i < position)   {                
                  temp[i] = num_list[i];            
              }
              else   {                
                  answer[i - position] = num_list[i];            
              }        
          }

        return temp;
    }
}