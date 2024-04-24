package Arrays;

import java.io.*;
import java.util.*;

public class subarrayDivisbleByK{
    public static int subArrayDivisbleByK(int arr[], int n, int k){
        int count = 0 , sum = 0;
        HashMap<Integer,Integer> hashMap= new HashMap<>();
        hashMap.put(sum,1);
        for(int x : arr){
            sum+=x;
            int rem = sum%k;
            if(rem<0) rem = rem+k;
            if(hashMap.containsKey(rem)){
                count+=hashMap.get(rem);
                hashMap.put(rem,hashMap.get(rem)+1);
            }else hashMap.put(rem,1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        int result = subArrayDivisbleByK(arr, n, k);
        System.out.print(result);
        System.out.println('\n');
    }
}
