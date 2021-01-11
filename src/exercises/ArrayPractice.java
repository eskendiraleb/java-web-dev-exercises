package exercises;

import java.util.Arrays;

public class ArrayPractice {

        public static void main(String[] args) {
            int[] arrays = {1, 1, 2, 3, 5, 8};
            String arrayName ="I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";
            System.out.println("Print each values of the array");

            for(int a:arrays){
                System.out.println(a);
            }
            System.out.println("Print odd numbers of the given array");

            for (int array : arrays) {
                if (array % 2 != 0) {
                    System.out.println(array);
                }
            }
            String[] inArray = arrayName.split(" ");
            System.out.println(Arrays.toString(inArray));

            String[] inArrays = arrayName.split("\\.");
            System.out.println(Arrays.toString(inArrays));
        }
    }

