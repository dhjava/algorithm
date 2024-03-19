package study_240319;

import java.util.*;

// 와 ㅅㅂ 드럽게 힘드네 몇분 걸렸냐 하
public class q3_x {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[] = new int[N];
        int S[] = new int[N];

        for(int i = 0; i<N; i++){
            A[i] = sc.nextInt();
            if(i == 0){
                S[i] = A[i];
            }else{
            S[i] = S[i-1] + A[i];
            }
        }

        int sum[] = new int[M];

        for(int i = 0; i<M; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x == 1){
                sum[i] = S[y-1];
            }else{
            sum[i] = S[y-1] - S[x-2];
            }
        }

        for(int i = 0; i<M; i++){
            System.out.println(sum[i]);
        }
    }
}
