/**
 * 검사 횟수를 줄이려면
 * 자릿수별로 666이 들어가는 숫자 범위를 찾아 검사하면 됨
 */
package backjoon.step.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_1436 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String six = "666";
        int count = 1;
        long result = 666;

        while(N > count) {
            result++;

            if (String.valueOf(result).contains(six)) {
                count++;
            }
        }

        System.out.println(result);

        br.close();
    }

}
