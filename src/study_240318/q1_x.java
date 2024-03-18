package study_240318;

import java.util.*;

public class q1_x {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s = 0;

        for(int i = 0; i<=a; i++){
            int b = sc.nextInt();
            s += b;
        }

        System.out.println(s);
    }
}
