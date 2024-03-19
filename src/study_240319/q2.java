package study_240319;

import java.util.*;

public class q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];

        for(int i = 0; i<N; i++){
            a[i] = sc.nextInt();
        }

        long sum = 0;
        long max = 0;
        
        for(int i = 0; i < N; i++){
            sum += a[i];
            if(max < a[i]){
                max = a[i];
            }
        }

        System.out.println(sum * 100.0 / max / 3);
    }
}
