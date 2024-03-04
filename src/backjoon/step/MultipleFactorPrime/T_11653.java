package backjoon.step.MultipleFactorPrime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_11653 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int prime = 2;

        while (N > 1) {
            if (N % prime == 0) {
                N /= prime;
                sb.append(prime).append("\n");
            } else {
                prime++;
            }
        }

        System.out.println(sb);

        br.close();
    }

}
