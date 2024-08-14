class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        for(int i=0; i<n/2; i++, answer++){
            if(a%2 == 1){
                if(a+1 == b) break;
            }else if(a-1 == b) break;
            a = a%2==0? a/2 : a/2+1;
            b = b%2==0? b/2 : b/2+1;
        }
        return answer;
    }
}