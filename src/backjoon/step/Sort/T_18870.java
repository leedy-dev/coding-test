package backjoon.step.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class T_18870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] list = new int[N];
        int[] sortedList = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sortedList[i] = Integer.parseInt(st.nextToken());
        }

        br.close();

        Arrays.sort(sortedList);

        Map<Integer, Integer> map = new HashMap<>();

        map.put(sortedList[0], 0);

        for (int i = 1; i < N; i++) {
            int now = sortedList[i];
            int before = sortedList[i-1];

            if (now != before) {
                map.put(now, map.get(before) + 1);
            }
        }

        for (int num : list) {
            sb.append(map.get(num)).append(" ");
        }

        System.out.println(sb);
    }

    public static void main2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();
        List<Integer> sortedList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
            sortedList.add(num);
        }

        br.close();

        Collections.sort(sortedList);

        Map<Integer, Integer> map = new HashMap<>();

        map.put(sortedList.get(0), 0);

        for (int i = 1; i < N; i++) {
            int now = sortedList.get(i);
            int before = sortedList.get(i-1);

            if (now != before) {
                map.put(now, map.get(before) + 1);
            }
        }

        for (int num : list) {
            sb.append(map.get(num)).append(" ");
        }

        System.out.println(sb);
    }

    public static void main3(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.valueOf(st.nextToken()));
        }

        br.close();

        List<Integer> sortedList = new ArrayList<>(list);

        Collections.sort(sortedList);

        Map<Integer, Integer> map = new HashMap<>();

        map.put(sortedList.get(0), 0);

        for (int i = 1; i < N; i++) {
            int now = sortedList.get(i);
            int before = sortedList.get(i-1);

            if (now != before) {
                map.put(now, map.get(before) + 1);
            }
        }

        for (int num : list) {
            sb.append(map.get(num)).append(" ");
        }

        System.out.println(sb);
    }

}
