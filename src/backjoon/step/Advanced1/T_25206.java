package backjoon.step.Advanced1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_25206 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        double totalCredit = 0.0;
        double totalGrade = 0.0;

        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());

            String sbj = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (grade.equals("P")) continue;;

            totalCredit += credit;
            totalGrade += getGrade(grade) * credit;
        }

        System.out.println(totalGrade / totalCredit);

        br.close();
    }

    public static double getGrade(String grade) {
        double g = 0.0;

        if (grade.startsWith("A")) g = 4.0;
        if (grade.startsWith("B")) g = 3.0;
        if (grade.startsWith("C")) g = 2.0;
        if (grade.startsWith("D")) g = 1.0;

        if (grade.endsWith("+")) g += 0.5;

        return g;
    }

}
