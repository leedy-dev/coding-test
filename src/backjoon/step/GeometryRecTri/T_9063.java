package backjoon.step.GeometryRecTri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_9063 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] x = new int[2];
        int[] y = new int[2];

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());

            if (x[0] == 0 || x[0] > p) x[0] = p;
            if (x[1] == 0 || x[1] < p) x[1] = p;

            if (y[0] == 0 || y[0] > q) y[0] = q;
            if (y[1] == 0 || y[1] < q) y[1] = q;
        }

        System.out.println((x[1] - x[0]) * (y[1] - y[0]));

        br.close();
    }

}
