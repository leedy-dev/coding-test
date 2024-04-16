package backjoon.step.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T_2751 {

    /**
     * counting 정렬
     * 정렬할 때 추천 => 시간복잡도 O(n)
     * 대신 배열 크기에 비해 숫자가 너무 클 때는 비추
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] counting = new int[2000001];
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            counting[num + 1000000]++;
        }

        for (int i = 1; i < counting.length; i++) {
            counting[i] += counting[i-1];
        }

        // 마지막 원소부터 정렬
        for (int i = arr.length-1; i >= 0; i--) {
            int val = arr[i];
            counting[val + 1000000]--;
            result[counting[val + 1000000]] = val;
        }

        for (int n : result) {
            sb.append(n).append("\n");
        }

        System.out.println(sb);

        br.close();
    }

    /**
     * counting 정렬
     * 
     * 중복 없기 때문에 boolean 배열로 응용
     */
    public static void main2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] arr = new boolean[2000001];

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000000] = true;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                sb.append((i - 1000000)).append("\n");
            }
        }

        System.out.println(sb);

        br.close();
    }

    /**
     * Collections 사용
     */
    public static void main3(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (int n : list) {
            sb.append(n).append("\n");
        }

        System.out.println(sb);

        br.close();
    }

    /**
     * Arrays.sort 사용
     */
    public static void main4(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int n : arr) {
            sb.append(n).append("\n");
        }

        System.out.println(sb);

        br.close();
    }

}
