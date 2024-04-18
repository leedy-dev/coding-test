package backjoon.step.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class T_10814 {

    static class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age + " " + name + "\n";
        }
    }

    /**
     * 객체 생성
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Person[] arr = new Person[N];

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            arr[i] = new Person(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        br.close();

        Arrays.sort(arr, (p1, p2) -> {
            return p1.age - p2.age;
        });

        for (int i = 0; i < N; i++) {
            sb.append(arr[i]);
        }

        System.out.println(sb);
    }

    public static void main2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String[][] arr = new String[N][2];

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        br.close();

        Arrays.sort(arr, Comparator.comparingInt(a -> Integer.parseInt(a[0])));

        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }

        System.out.println(sb);
    }

}
