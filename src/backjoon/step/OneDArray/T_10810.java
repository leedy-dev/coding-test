package backjoon.step.OneDArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_10810 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] array = new String[N];

        for (int i = 0; i < N; i++) {
            array[i] = "0";
        }

        for (int t = 0; t < M; t++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            String k = st.nextToken();

            do {
                array[i++ - 1] = k;
            } while(i <= j);
        }

        sb.append(array[0]);

        for (int i = 1; i < N; i++) {
            sb.append(" ").append(array[i]);
        }

        System.out.println(sb);

        br.close();
    }

}
