package Arrays;

import java.util.*;

public class SecondLargest{
    public static void secondLargest(int[] arr, int n) {
        PriorityQueue<Integer> findSecondLargest = new PriorityQueue<>();
        for(int x : arr) findSecondLargest.add(x);

        while(findSecondLargest.size()>2) findSecondLargest.remove();
        System.out.println(findSecondLargest.remove());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        secondLargest(arr,n);
        sc.close();
    }
}