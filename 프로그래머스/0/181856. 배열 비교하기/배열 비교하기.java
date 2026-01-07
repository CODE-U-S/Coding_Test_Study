class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr11 = 0;  //배열 1 원소들의 합
        int arr22 = 0;  //배열 2 원소들의 합
        if (arr1.length < arr2.length) {
            answer = -1;
        }
        else if (arr1.length > arr2.length) {
            answer = 1;
        }
        else if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                arr11 += arr1[i];
                arr22 += arr2[i];
            }
            if (arr11 > arr22) {
                answer = 1;
            }
            else if (arr11 < arr22) {
                answer = -1;
            }
            else if (arr11 == arr22) {
                answer = 0;
            }
        }
        return answer;
    }
}