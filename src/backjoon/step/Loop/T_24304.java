package backjoon.step.Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_24304 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        long sum = 0L;

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            sum += Long.parseLong(st.nextToken()) * Integer.parseInt(st.nextToken());
        }

        if (X == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        br.close();
    }

}
