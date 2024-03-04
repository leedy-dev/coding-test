package backjoon.step.OneDArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_10811 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = i+1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int p = Integer.parseInt(st.nextToken()) - 1;
            int q = Integer.parseInt(st.nextToken()) - 1;

            while(p <= q) {
                int tmp = array[p];
                array[p++] = array[q];
                array[q--] = tmp;
            }
        }

        sb.append(array[0]);

        for (int i = 1; i < N; i++) {
            sb.append(" ").append(array[i]);
        }

        System.out.println(sb);

        br.close();
    }

}
