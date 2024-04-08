package backjoon.step.GeometryRecTri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_14215 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a >= b && a >= c) System.out.println(sum(a, b, c));
        else if (b >= a && b >= c) System.out.println(sum(b, a, c));
        else System.out.println(sum(c, a, b));

        br.close();
    }

    static int sum(int max, int a, int b) {
        int sum = a + b;

        return max >= sum ? sum + sum - 1 : sum + max;
    }

}
