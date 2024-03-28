import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int nKG = sc.nextInt();
        int threeKG = 0, fiveKG = nKG / 5;
        int answer = -1;
        for(int i = 0; i < nKG / 3; i++) {
        	if((nKG - 5*fiveKG) % 3 == 0 ) {
        		threeKG = (nKG - 5*fiveKG) / 3;
        		if(answer > threeKG + fiveKG || answer == -1) {
        			answer = threeKG + fiveKG;
        		}
        	}else {
        		fiveKG--;
        	}
        }
        
        System.out.println(answer);
    }
}
