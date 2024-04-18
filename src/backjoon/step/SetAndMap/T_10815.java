package backjoon.step.SetAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class T_10815 {

    static int N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 갖고 있는 카드
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 정렬 (오름차순)
        Arrays.sort(arr);

        // 확인할 카드
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (binarySearch(num)) sb.append(1).append(" ");
            else sb.append(0).append(" ");
        }

        br.close();

        System.out.println(sb);
    }

    // 이진 탐색
    static boolean binarySearch(int num) {
        int leftIdx = 0;
        int rightIdx = N-1;

        while(leftIdx <= rightIdx) {
            int midIdx = (leftIdx + rightIdx) / 2;
            int midNum = arr[midIdx];

            if (num > midNum) leftIdx = midIdx + 1;
            else if (num < midNum) rightIdx = midIdx - 1;
            else return true;
        }

        return false;
    }

    /**
     * set 활용
     */
    public static void main2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(Integer.valueOf(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            if (set.contains(Integer.parseInt(st.nextToken()))) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            sb.append(" ");
        }

        br.close();

        System.out.println(sb);
    }

}
