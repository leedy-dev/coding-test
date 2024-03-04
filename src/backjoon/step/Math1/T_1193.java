package backjoon.step.Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_1193 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int X = Integer.parseInt(br.readLine());

        int count = 1;
        int n = 1;

        while (count < X) {
            count += ++n;
        }

        int p = n - (count - X);

        if (n % 2 == 0) {
            sb.append(p).append("/").append(n + 1 - p);
        } else {
            sb.append(n + 1 - p).append("/").append(p);
        }

        System.out.println(sb);

        br.close();
    }

}
