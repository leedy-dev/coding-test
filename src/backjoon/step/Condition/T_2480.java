package backjoon.step.Condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class T_2480 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] array = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        Arrays.sort(array);

        int eqCnt = 0;

        for (int i = 0; i < 2; i++) {
            if (array[i] == array[i+1]) eqCnt++;
        }

        if (eqCnt == 2) System.out.println(10000 + (array[0] * 1000));
        else if (eqCnt == 1) System.out.println(1000 + (array[1] * 100));
        else System.out.println(array[2] * 100);

        br.close();
    }

}
