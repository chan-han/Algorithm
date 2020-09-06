import java.util.Scanner;

public class backjoon_1546 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double avg = 0;
        int N = in.nextInt();
        double[] score = new double[N];
        double max = score[0];
        for (int i = 0; i < N; i++) {
            score[i] = in.nextInt();
            if (max < score[i]) {
                max = score[i];
            }


        }
        for (int i = 0; i < N; i++)
            avg += score[i] / max * 100;

        System.out.println(avg / N);


    }
}

