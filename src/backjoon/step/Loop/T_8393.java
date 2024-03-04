package backjoon.step.Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_8393 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        while(n > 0) {
            result += n--;
        }

        System.out.println(result);

        br.close();
    }

    public static void main2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(sumN(Integer.parseInt(br.readLine())));

        br.close();
    }

    private static int sumN(int n) {
        if (n == 0) return 0;

        return n + sumN(--n);
    }

}
