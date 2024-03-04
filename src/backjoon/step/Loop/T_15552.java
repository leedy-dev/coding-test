package backjoon.step.Loop;

import java.io.*;
import java.util.StringTokenizer;

public class T_15552 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
        }

        System.out.println(sb);

        br.close();
    }

    public static void main2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(sum));
            bw.newLine();
        }

        bw.flush();

        br.close();
        bw.close();
    }

}
