package backjoon.step.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_10989 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] counting = new int[10001];

        // 카운팅 배열
        for (int i = 0; i < N; i++) {
            counting[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i < 10001; i++) {
            while (counting[i] > 0) {
                sb.append(i).append("\n");
                counting[i]--;
            }
        }

        System.out.println(sb);

        br.close();
    }

}
