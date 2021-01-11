package exercises;
import java.util.Arrays;
//import java.util
public class ArrayListPractice {
    public static void main(String[] args){
        int[] newNumbers = {1,2,3,4,5,6,7,8,9,10,};
        String arrayName ="I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";

            String[] words = arrayName.split(" ");
            System.out.println(Arrays.toString(words));
            for (int i=0; i < words.length; i++){
                if(arrayName.charAt(i)< 5){
                    System.out.println(count);
                    count = 0;
                }
                else{
                    count ++;
                }

            }
        }
    }

