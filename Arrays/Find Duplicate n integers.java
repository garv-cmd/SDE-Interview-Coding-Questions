package Arrays;
//Find the duplicate in an array of N integers.
/*
*
* Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
*  prove that at least one duplicate number must exist. Assume that there is only one duplicate number,
*  find the duplicate one.
*
* LEETCODE -287
* */
class Q1 {
    public static int findDuplicate(int[] nums){
//solution ->LinkedList Cycle Method + Tortoise Method
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);
        fast = nums[0];
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;


    }
    public static void main(String args[]){
        int arr[] = {1,3,4,2,2};
        int dup = findDuplicate(arr);
        System.out.println(dup);
    }
}
