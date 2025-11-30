class Solution {
    public String solution(String my_string) {
        char[] arr = new char[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32); 
            }

            arr[i] = c;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { 
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }

        return result;
    }
}
