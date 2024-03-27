import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxNumInArray {

	public static void main(String[] args) throws Exception{
		int arr[][] = new int[9][9];
		int max=-1, row=0, col=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < arr.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(max < arr[i][j]) {
					max = arr[i][j];
					row=i+1;
					col=j+1;
				}
			}//inner for
		}//outter for
		System.out.println(max);
		System.out.println(row + " " + col);
	}

}
