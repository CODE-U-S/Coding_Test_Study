class Solution {
    public String solution(String new_id) {
        String s = new_id.toLowerCase();
		new_id = "";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='0' && ch<='9') || ch=='-' || ch=='_')
				new_id += ch;
			else if(ch=='.') {
				if(!new_id.isEmpty() && new_id.charAt(new_id.length()-1) != '.')
					new_id += ch;
			}
		}
		if(!new_id.isEmpty() && new_id.charAt(0) == '.')
			new_id = new_id.substring(1);
		if(!new_id.isEmpty() && new_id.charAt(new_id.length()-1) == '.')
			new_id = new_id.substring(0, new_id.length()-1);
		if(new_id.isEmpty()) new_id = "a";
		if(new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
			if(new_id.charAt(14) == '.')
				new_id = new_id.substring(0, 14);
		}
		while(new_id.length() <= 2)
			new_id += new_id.charAt(new_id.length()-1);
        return new_id;
    }
}