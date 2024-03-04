package backjoon.step.Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_2903 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
          과정 수 = N
          한변에 존재하는 점 개수의 제곱
          과정당 변의 증가량 = 2배, 점의 개수 = 변의 개수 + 1
          변의 개수 = 2 ^ N
          총 점의 개수 = (변의 개수 + 1) ^ 2 = ((2 ^ N) + 1) ^ 2
         */
        System.out.println((int) Math.pow(Math.pow(2, Integer.parseInt(br.readLine())) + 1, 2));

        br.close();
    }

}
