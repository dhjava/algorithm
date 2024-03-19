package study_240319;

import java.util.*;

public class q2_x {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = 0;
        int sum = 0;

        for(int i = 0; i<=N; i++){
            int a = sc.nextInt();
            if(a > M){
                M = a;
            }
            int b = a / M * 100;
            sum += b;
        }

        float avg = sum / N; 
        System.out.println(avg);
    }
}
