import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        String input = sc.nextLine();
        st = new StringTokenizer(input);
        
        String first, second, result = "init";
        first = st.nextToken();
        second = st.nextToken();
        
        for(int i = 2; i >= 0; i--){
            if(first.charAt(i) > second.charAt(i)){
                result = first;
                break;
            }else if(first.charAt(i) < second.charAt(i)){
                result = second;
                break;
            }
        }
        
        for(int i = 2; i >= 0; i--){
            System.out.print(result.charAt(i));
        }
        
        sc.close();
    }
}
