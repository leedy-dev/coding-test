package backjoon.step.OneDArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int first = Integer.parseInt(st.nextToken());

        int M = first;
        int m = first;

        for (int i = 0; i < N-1; i++) {
            int n = Integer.parseInt(st.nextToken());

            if (n > M) M = n;
            if (n < m) m = n;
        }

        sb.append(m).append(" ").append(M);

        System.out.println(sb);

        br.close();
    }

}
