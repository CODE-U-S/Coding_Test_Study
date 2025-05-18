class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] arr = new String[myString.length()];
        for(int i=0; i<arr.length; i++){
            arr[i] = Character.toString(myString.charAt(i));
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("a") || arr[i].equals("A")){
                answer += "A";
            }
            else{
                answer += arr[i].toLowerCase();
            }
        }
        return answer;
    }
}