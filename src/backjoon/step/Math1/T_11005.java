package backjoon.step.Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_11005 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        while (N > 0) {
            long rem = N % B;
            if (rem < 10) {
                sb.append(rem);
            } else {
                char c = (char) (rem - 10 + 'A');
                sb.append(c);
            }

            N /= B;
        }

        System.out.println(sb.reverse());

        br.close();
    }

}
