package backjoon.step.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class T_2587 {

    /**
     * 직접 정렬
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int sum = 0;

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            arr[i] = num;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j < 5; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        sb.append(sum/5).append("\n").append(arr[2]);

        System.out.println(sb);

        br.close();
    }

    /**
     * Arrays.sort 사용
     */
    public static void main2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int sum = 0;

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            arr[i] = num;
        }

        Arrays.sort(arr);

        sb.append(sum/5).append("\n").append(arr[2]);

        System.out.println(sb);

        br.close();
    }

}
