import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] alpabet_distinct = new int[26];
        
        String firstLine = bf.readLine();
        int code_len = Integer.parseInt(firstLine.split(" ")[0]);
        char many_char = firstLine.split(" ")[1].charAt(0);
        String code = bf.readLine();
        
        bf.close();
        
        int many_alpabet = 0;
        char many_letter = 'A';
        for(int i = 0; i < code_len; i++) {
        	alpabet_distinct[code.charAt(i) - 'A']++;
        	if(many_alpabet < alpabet_distinct[code.charAt(i) - 'A']) {
        		many_alpabet = alpabet_distinct[code.charAt(i) - 'A'];
        		many_letter = code.charAt(i);
        	}
        }
        int key = (int)(many_char - many_letter);
        
        for(int i = 0; i < code_len; i++) {
        	if(code.charAt(i) + key < 'A') {
        		bw.write((char)('Z' + code.charAt(i) + key - 'A' + 1));
        	}else if(code.charAt(i) + key > 'Z') {
        		bw.write((char)('A' + code.charAt(i) + key - 'Z' - 1));
        	}else {
        		bw.write((char)(code.charAt(i) + key));
        	}
        }
        
        bw.flush();
        bw.close();
        
    }// main
}
