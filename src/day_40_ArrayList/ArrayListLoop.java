package day_40_ArrayList;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();  // polymorphic way of declaring
        System.out.println(nums);
        System.out.println("Size = " + nums.size());
        nums.add(34); nums.add(44); nums.add(3); nums.add(88); nums.add(500);
        nums.add(5); nums.add(845); nums.add(0); nums.add(88);
        System.out.println("nums = " + nums);

        nums.remove(0);
        System.out.println(nums);

        //nums.remove(88);   we have to boxed first - this time show IndexOutOfBoundsExceptions
        nums.remove(new Integer(88));
        System.out.println(nums);

        // for loop - iterate through all values and print

        for (int i = 0; i < nums.size();i++) {
            System.out.println(nums.get(i));
        }
        // for each loop, and print all in same line

        for (int each :nums) {
            System.out.print(each + " ");
        }

    }
}
