package Arrays;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.TreeMap;

//Merge two sorted Arrays without extra space
public class Q4 {
    public static void main(String args[]){
        //SOLUTION GAP METHOD-> https://www.geeksforgeeks.org/efficiently-merging-two-sorted-arrays-with-o1-extra-space/
        //Easy Solution using priorityQueue
        int a1[] = {2,5,7,3,9};
        int a2[] = {1,4,6,8};

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:a1){
           pq.add(i);
        }
        for (int i:a2){
            pq.add(i);
        }
        for(int i=0;i<a1.length;i++){
            a1[i] = pq.remove();
        }
        for(int i=0;i<a2.length;i++){
            a2[i] = pq.remove();
        }
        //print->
        for(int i:a1)
            System.out.print(i+" ");
        System.out.println();
        for(int i:a2)
            System.out.print(i+" ");


    }
}
