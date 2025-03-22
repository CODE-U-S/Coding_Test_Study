import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        int arr[] = new int[1000];

        Arrays.sort(arr);

        for ( int i = 0 ; i < array.length ; i++ ) {

            arr[array[i]] += 1;

        }

        Integer arrMaxOverlap[] = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arrMaxOverlap,Collections.reverseOrder());

        if ( arrMaxOverlap[0] == arrMaxOverlap[1]) {
            return -1;
        }

        for ( int i = 0 ; i < arr.length ; i++ ) {

            if ( max < arr[i]) {

                max = arr[i];
                answer = i;
            } 
        }
        return answer;
    }
}