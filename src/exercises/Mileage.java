package exercises;
import java.util.Scanner;
public class Mileage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles u have driven.");
        double miles = input.nextDouble();
        System.out.println("Enter gas amount you have consumed.");
        double fuel = input.nextDouble();
        double milePerGallon = miles/fuel;
        System.out.println("The Miles you travel per gallon is " + milePerGallon);

    }
}
