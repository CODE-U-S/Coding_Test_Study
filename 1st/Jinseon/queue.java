import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> q = new LinkedList<>();
        int sizes = Integer.parseInt(br.readLine());

        for (int i = 0; i < sizes; i++) {
            String respond = br.readLine();

            if (respond.startsWith("push")) {
                // 정수 넣기
                int value = Integer.parseInt(respond.split(" ")[1]);
                q.add(value);
            } else if (respond.startsWith("pop")) {
                // 가장 앞에 있는 정수 빼기
                Integer removedValue = q.poll();
                if (removedValue == null) {
                    bw.write("-1\n");
                } else {
                    bw.write(String.valueOf(removedValue) + "\n");
                }
            } else if (respond.startsWith("size")) {
                // 큐에 들어있는 정수의 개수
                bw.write(String.valueOf(q.size()) + "\n");
            } else if (respond.startsWith("empty")) {
                // 큐가 비었으면 1, 아니면 0
                bw.write(q.isEmpty() ? "1\n" : "0\n");
            } else if (respond.startsWith("front")) {
                // 큐의 가장 앞에 있는 정수 출력, 없으면 -1
                if (q.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(String.valueOf(q.peek()) + "\n");
                }
            } else if (respond.startsWith("back")) {
                // 큐의 가장 뒤에 있는 정수 출력, 없으면 -1
                if (q.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    LinkedList<Integer> linkedList = (LinkedList<Integer>) q;
                    bw.write(String.valueOf(linkedList.getLast()) + "\n");
                }
            }
        }
        // 버퍼 비우기
        bw.flush();
    }
}
