import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] array = input.split(" ");
		int a = Integer.parseInt(array[0]);
		int b = Integer.parseInt(array[1]);
		int c = Integer.parseInt(array[2]);
		int n = Integer.parseInt(array[3]);
		boolean answer = false;
    for(int i=0;i<=n/a;i++){
      for(int j=0;j<=n/b;j++){
        for(int k=0;k<=n/c;k++){
          if(a*i+b*j+c*k==n){
            answer = true;
            break;
          }
        }
      }
    }
		int result = answer ? 1 : 0;
		System.out.print(result);
	}
}