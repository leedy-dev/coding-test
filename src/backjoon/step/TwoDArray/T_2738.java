package backjoon.step.TwoDArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_2738 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] array = new int[N][M];

        for (int i = 0; i < N*2; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                if (i < N) {
                    array[i][j] = Integer.parseInt(st.nextToken());
                } else {
                    array[i - N][j] += Integer.parseInt(st.nextToken());
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(array[i][j]);

                if (j < M-1) sb.append(" ");
                else if (i < N-1) sb.append("\n");
            }
        }

        System.out.println(sb);

        br.close();
    }

}
