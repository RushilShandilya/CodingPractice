package Arrays;

import java.util.*;

public class ArrayProblem6 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int ans=ArrayProblem6(n,arr);
        System.out.println(ans);
    }
    public static int ArrayProblem6(int n, int[] arr){
        if(countEvenNumbers(arr)<=1) return -1;
        int dist = 0 , pIndex=-1 , nIndex = -1;
        for(int i = 0 ; i<n ; ++i){
           int x = arr[i]%2;
           if(x==0){
               if (pIndex == -1) pIndex = i;
               else if (nIndex==-1){
                   nIndex = i;
                   dist = Math.abs(nIndex-pIndex);
               }else{
                   int dist1 = Math.abs(nIndex-i);
                   int dist2 = Math.abs(pIndex-i);

                   if(dist2>dist1 && dist>dist1) dist = dist1;
                   else if(dist1>dist2 && dist>dist2) dist = dist2;

                   pIndex = nIndex;
                   nIndex = i;
               }
           }
        }
        return dist;
    }
    public static int countEvenNumbers(int[] arr){
        int count = 0;
        for(int x : arr) if(x%2==0 && x>0) ++count;
        return count;
    }
}
