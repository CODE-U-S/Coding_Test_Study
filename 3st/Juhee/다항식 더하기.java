class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int xNum=0;
        int num=0;
        
        String[] arr=polynomial.split(" ");
        for(int i=0; i<arr.length; i++){
            if(arr[i].contains("x")){
                if(arr[i].equals("x")){
                    xNum+=1;
                }else{
                    xNum+=Integer.parseInt(arr[i].replaceAll("x",""));
                }
            }else if(!arr[i].equals("+")){
                num+=Integer.parseInt(arr[i]);
            }
        }
        
        if(xNum!=0 && num==0){
            answer=xNum==1?"x":xNum+"x";
        }else if(xNum!=0 && num!=0){
            answer=xNum==1?"x"+" + "+num:xNum+"x"+" + "+num;
        }else if(xNum==0 && num!=0){
            answer=String.valueOf(num);
        }
        
        return answer;
    }
}