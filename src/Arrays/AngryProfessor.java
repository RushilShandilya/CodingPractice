package Arrays;

import java.util.*;

public class AngryProfessor{
    public static void angryProfessor(int[] arr, int n ,int k){
        int count = 0;
        for(int time : arr) if(time<=0) ++count;

        if(count<k) System.out.println("YES");
        else System.out.println("NO");

    }
    public static void main(String[] args) throws Throwable{
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        angryProfessor(arr, n,k);
    }
}