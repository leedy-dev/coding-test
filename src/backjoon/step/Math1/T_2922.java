package backjoon.step.Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_2922 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int room = 1;
        int count = 1;

        while (room < N) {
            room += 6 * count++;
        }

        System.out.println(count);

        br.close();
    }

}
