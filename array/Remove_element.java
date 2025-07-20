public class Remove_element {
    public static void main(String[] args) {
        int nums[] = {3, 2, 2, 3}; // initial array
        int val = 3; // value to be removed
        String result = "_";

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                nums[i] = result.charAt(0); // replace the element with '_'
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != result.charAt(0)) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
