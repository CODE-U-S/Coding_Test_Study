class Solution {
    public int solution(int[] num_list) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2==0){//짝수
                sb1.append(num_list[i]);
            }else{
                sb2.append(num_list[i]);
            }
        }
        
        int n1 = Integer.parseInt(sb1.toString());
        int n2 = Integer.parseInt(sb2.toString());
        
        return n1 + n2;
    }
}