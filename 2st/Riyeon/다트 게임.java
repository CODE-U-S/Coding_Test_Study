class Solution {
    public int solution(String dartResult) {
        int[] dart = new int[3];
        char[] arr = dartResult.toCharArray();
        
        int n=-1;
        for(int i=0; i<arr.length;i++){
            if(arr[i] == '1' && arr[i+1] == '0'){
                dart[++n] = 10;
                i++;
                continue;
            }else if(arr[i] >='0' && arr[i] <= '9'){
                dart[++n] = Integer.parseInt(String.valueOf(arr[i]));
                continue;
            }
            
            switch (arr[i]){
                case 'D': 
                    dart[n] = (int) Math.pow(dart[n], 2);
                    break;
                case 'T':
                    dart[n] = (int) Math.pow(dart[n], 3);
                    break;
                case '*':
                    dart[n] *= 2;
                    if(n-1 >=0) dart[n-1] *= 2;
                    break;
                case '#':
                    dart[n] *= -1;
            }// switch
        }
        return dart[0] + dart[1] + dart[2];
    }
}