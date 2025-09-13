class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int temp=0;
        for(int i=1; i<array.length; i++) {
            for(int j=0; j<i; j++) {
                if(array[i]<array[j]) {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return answer=array[(array.length+1)/2-1];
    }
}