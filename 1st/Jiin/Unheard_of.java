import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> unheard = new ArrayList<String>();
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        HashMap<String, Integer> naverHeard = new HashMap<String, Integer>();
        
        for(int i = 0; i < n; i++)
            naverHeard.put(sc.next(), 1);
    
        for(int i = 0; i < m; i++){
            String temp = sc.next();
            if(naverHeard.containsKey(temp)){
                unheard.add(temp);
            }
        }
        
        Collections.sort(unheard);
        System.out.println(unheard.size());
        for(int i = 0; i < unheard.size(); i++){
            System.out.println(unheard.get(i));
        }
    }
}