class Solution {
    public int solution(int[] num_list) {
        int square = 0;
        int mul = 1;
        
        for(int i=0; i<num_list.length; i++) {
            square += num_list[i];
            mul *= num_list[i];
        }
        square *= square;
    
        if(mul < square){
            return 1;
        }else{
            return 0;
        }
    }
}