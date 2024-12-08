class Solution {
    public int solution(int[] num_list) {
        int add,even;
        int answer;
        add = even = 0;
        for(int i = 0; i < num_list.length; i++){
            if (i % 2 == 0){
                add += num_list[i];
            }
            else if (i % 2 == 1){
                even += num_list[i];
            }

         }
        answer = add;
        if (answer < even){
            answer = even;
        }
        return answer;
    }
}
