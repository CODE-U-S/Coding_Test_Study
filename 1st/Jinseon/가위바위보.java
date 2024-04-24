import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] inputArray = input.split(" ");
		int[] member = new int[5];
		int result = 0;
		for(int i = 0; i < member.length; i++)
			member[i] = Integer.parseInt(inputArray[i]);
		int lack = 0, siger = 0, paper = 0;
		for(int i = 0; i < 5; i++){
			//1.가위, 2.바위, 3.보
				switch(member[i]){
					case 1: siger++; break;
					case 2: lack++; break;
					default: paper++;
				}
		}
		
		if(!(lack > 0 && siger > 0 && paper > 0)){
			for(int i = 0; i < 5; i++){
				if(siger > 0){
					if(lack > 0) result = lack;
					else result = siger;
				} else if(lack > 0){
						if(paper > 0) result = paper;
						else result = lack;
				} else result = paper;
				
			}
		}
		if(result == 5) 	System.out.print("0");
		else 	System.out.print(result);
	}
}