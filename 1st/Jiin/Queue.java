import java.util.*;
import java.io.*;

public class Main{
	static enum command{
		push,
		pop,
		size,
		empty,
		front,
		back
	};
	
	public static void main(String[] args) throws IOException{
		Queue<Integer> queue = new LinkedList<Integer>();
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int cmdLength = Integer.parseInt(bf.readLine());
		String cmd = "";
		int last = 0;
		
		for(int i = 0; i < cmdLength; i++) {
			cmd = bf.readLine();
			StringTokenizer st = new StringTokenizer(cmd);
			cmd = st.nextToken();
			try {
				switch(command.valueOf(cmd)) {
				case push : 
					last = Integer.parseInt(st.nextToken());
					queue.add(last); 
					break;
				case pop : 
					System.out.println(queue.remove());
					break;
				case size : 
					System.out.println(queue.size()); 
					break;
				case empty : 
					if(queue.isEmpty())
						System.out.println(1);
					else
						System.out.println(0);
					break;
				case front : 
					System.out.println(queue.element());
					break;
				case back : 
					if(!queue.isEmpty())
						System.out.println(last);
					else
						System.out.println(-1);
					break;
				}
			}catch(NoSuchElementException e) {
				System.out.println(-1);
			}
		}
	}
}
