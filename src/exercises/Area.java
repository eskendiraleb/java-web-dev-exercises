package exercises;
import java.util.Scanner;
public class Area {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width please!");
        double width = input.nextDouble();
        System.out.println("Enter the length please!");
        double length = input.nextDouble();
        double area = width * length;
        System.out.println("Area of the rectangle is " + area);

    }
}