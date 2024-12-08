import java.util.*;

class BaekJoon_18312 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int count=0;
		
		for(int hour=0;hour<=n;hour++) {
			for(int min=0;min<60;min++) {
				for(int sec=0;sec<60;sec++) {

					String time=((hour<10)?"0"+hour:""+hour)+
							((min<10)?"0"+min:""+min)+
							((sec<10)?"0"+sec:""+sec);
					
					if(time.contains(""+k))
						count++;
				}
			}
		}
		sc.close();
		
		System.out.println(count);
	}

}