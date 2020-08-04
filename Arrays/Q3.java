package Arrays;
//https://www.geeksforgeeks.org/find-a-repeating-and-a-missing-number/

import java.util.HashMap;
import java.util.Map;

public class Q3 {
    public static void main(String args[]){
        //SOLUTION -> Using HashMap
        int arr[] = {4, 3, 6, 2, 1, 1};
        Map<Integer,Boolean> map = new HashMap<>();
        int max = arr.length;
        for(int i:arr){
            if(map.get(i)==null){
                map.put(i,true);
            }
            else{
                System.out.println("Repeating Number -> "+i);
            }
        }
        for(int i=1;i<=max;i++){
            if(map.get(i)==null){
                System.out.println("Missing Number -> "+i);

            }
        }
    }
}
