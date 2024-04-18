package backjoon.step.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class T_1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        br.close();
        
        Arrays.sort(arr, (a1, a2) -> {
            if (a1.length() == a2.length()) {
                return a1.compareTo(a2); // 사전순 정렬
            } else {
                return a1.length() - a2.length();
            }
        });

        sb.append(arr[0]).append("\n");

        for (int i = 1; i < N; i++) {
            // 중복되지 않은 경우 추가
            if (!arr[i].equals(arr[i-1])) {
                sb.append(arr[i]).append("\n");
            }
        }

        System.out.println(sb);
    }

}
