class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder s = new StringBuilder();
        s.append(my_string);
        
        for (int i = 0; i < queries.length; i++) {
            StringBuilder temp = new StringBuilder();
            temp.append(s.toString().substring(queries[i][0], queries[i][1] + 1));
            s.replace(queries[i][0], queries[i][1] + 1, temp.reverse().toString());
        }
        return s.toString();
    }
}