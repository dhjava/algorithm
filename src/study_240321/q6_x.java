package study_240321;

import java.util.Scanner;

public class q6_x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int count, start_index, end_index, sum;
        count = start_index = end_index = sum = 1;

        while(end_index != N){
            if(sum == N){
                count++;
                end_index++;
                sum = sum + end_index;
            }else if(sum > N){
                sum = sum - start_index;
                start_index++;
            }else if(sum < N){
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(sum);

    }
}
