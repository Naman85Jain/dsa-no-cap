public class Search_position {
    public static void main(String[] args) {
        // int nums[] = {1, 2, 3, 4, 5}; 
        // int target = 3; 
        // int index = -1;

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] != target) {
        //         index++; 
        //     }
        // }
        // System.out.println(index);

        int nums[] = {1, 3, 5, 6};
        int target = 2;
        int index = 0; 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                index++; 
            } else {
                break; // stop when we find the first element greater than or equal to target
            }
        }
        System.out.println("Insert position: " + index); // print the index where target should be inserted}
}
}