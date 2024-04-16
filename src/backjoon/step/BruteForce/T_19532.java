package backjoon.step.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_19532 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        int x = (b * f - e * c) / (b * d - a * e);
        int y = (a * f - d * c) / (a * e - b * d);

        sb.append(x);
        sb.append(" ");
        sb.append(y);

        System.out.println(sb);

        br.close();
    }

    public static void main2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] array = new int[6];

        for (int i = 0; i < 6; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();

        loop:
        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if (array[0] * i + array[1] * j == array[2] && array[3] * i + array[4] * j == array[5]) {
                    sb.append(i);
                    sb.append(" ");
                    sb.append(j);

                    System.out.println(sb);

                    break loop;
                }
            }
        }

        br.close();
    }

}
