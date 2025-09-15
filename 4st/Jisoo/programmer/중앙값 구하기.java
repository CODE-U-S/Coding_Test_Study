import java.util.Arrays; 
class Solution {
    public int solution(int[] array) {
<<<<<<< HEAD
        Arrays.sort(array);
        int mid = array.length / 2;
        return array[mid];
    }
}
=======
        int answer = 0;
        Arrays.sort(array);
        int mid=array.length/2;
        answer=array[mid];
        return answer;
    }
}
>>>>>>> 87bb6c70 ([PGS] 문자열 정렬하기 (1) / Level.0)
