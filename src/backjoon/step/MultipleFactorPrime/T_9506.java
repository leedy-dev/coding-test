package backjoon.step.MultipleFactorPrime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class T_9506 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            int n = Integer.parseInt(br.readLine());

            if (n == -1) break;

            Set<Integer> set = new TreeSet<>();

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    set.add(i);
                    set.add(n / i);
                }
            }

            if (n == set.stream().mapToInt(Integer::intValue).sum() + 1) {
                sb.append(n).append(" = 1");
                for (int i : set) {
                    sb.append(" + ").append(i);
                }
            }
            else {
                sb.append(n).append(" is NOT perfect.");
            }

            sb.append("\n");
        }

        System.out.println(sb);

        br.close();
    }

}
