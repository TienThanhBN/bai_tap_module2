import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Your weight");
        weight = scanner.nextDouble();
        System.out.println(weight);
        System.out.println("Your height");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.println("Your bmi is " + bmi);
        if (bmi < 18) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Overweight");
        } else if (bmi < 30) {
            System.out.println("Normal weight");
        } else {
            System.out.println("Obese");
        }
    }
}
