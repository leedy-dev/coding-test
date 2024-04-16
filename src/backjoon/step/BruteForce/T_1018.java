package backjoon.step.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class T_1018 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 행
        int M = Integer.parseInt(st.nextToken()); // 열

        String[] array = new String[N];

        for (int i = 0; i < N; i++) {
            array[i] = br.readLine();
        }

        br.close();

        int result = Integer.MAX_VALUE;

        for (int n = 0; n <= N - 8; n++) {
            for (int m = 0; m <= M - 8; m++) {
                // 제공된 보드에서 가장 작은 비용이 드는 8x8 배열 찾기
                result = Math.min(
                        result,
                        getMinCost(n, m, array)
                );
            }
        }

        System.out.println(result);
    }

    /**
     * @param row array 원소의 시작 행
     * @param col array 원소의 시작 열
     * @param array 입력 받은 배열
     */
    static int getMinCost(int row, int col, String[] array) {
        String[] board = {"WBWBWBWB", "BWBWBWBW"}; // 화이트 시작, 블랙 시작

        // 흰색을 기준으로 시작했을 때 count
        int whiteCount = 0;

        for (int i = 0; i < 8; i++) {
            int r = row + i;

            for (int j = 0; j < 8; j++) {
                int c = col + j;

                if (array[r].charAt(c) != board[r % 2].charAt(j)) whiteCount++;
            }
        }

        // 8x8 배열에서 변경해야할 최소 칸 수
        // 검은색 기준으로 시작하면 8x8에서 흰색 기준을 뺀 값과 같음
        return Math.min(whiteCount, 64 - whiteCount);
    }

}
