package Arrays;
//LEETCODE - 75
//sort an array of 0,1,2
public class Q2 {

    public static void sortColors(int[] nums){
    //SOLUTION -> Dutch National Flag Algorithm
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        int temp;
        while(mid <= high){
            switch (nums[mid]){
                case 0:
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    mid++;
                    low++;
                    break;
                case 1:mid++;
                break;
                case 2:
                    temp = nums[high];
                    nums[high] =nums[mid];
                    nums[mid] = temp;
                    high--;
                    break;
            }
        }

    }

    public static void main(String args[]){
        int arr[] = {2,0,2,1,1,0};
        sortColors(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
