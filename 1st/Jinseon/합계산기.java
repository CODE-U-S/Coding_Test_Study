import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        int sum = 0; 

        for (int n = 0; n < num; n++) {
            String input = br.readLine(); 
            String[] tokens = input.split(" "); 
            
            int result = Integer.parseInt(tokens[0]);
            
            for (int i = 1; i < tokens.length; i += 2) {
                String operator = tokens[i];
                int operand = Integer.parseInt(tokens[i + 1]);
                
                switch (operator) {
                    case "+":
                        result += operand; break;
                    case "-":
                        result -= operand; break;
                    case "*":
                        result *= operand; break;
                    case "/":
                        result /= operand; break;
                    default:
                        System.out.println("error");
                        return;
                }
            }

            sum += result;
        }

        System.out.println(sum);
    }
}
