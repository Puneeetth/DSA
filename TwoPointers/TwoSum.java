public class TwoSum{
    public static boolean twoSum(int[] arr,int target){
        int n = arr.length;
        if(arr.length == 0 || target == 0) return false;

        int left = 0, right = n - 1;
        while(left < right){
            if(arr[left] + arr[right] == target){
                return true;
            }else if(arr[left] + arr[right] < target){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args){
         int[] arr = {1,2,3,4,5};
         int target = 5;

         if (twoSum(arr, target)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}