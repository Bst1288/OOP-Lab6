import java.util.Scanner;

public class Pro1_BMI{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //-----name-----//
        System.out.print("Enter name : ");
        String name = input.nextLine();
        //-----age-----//
        System.out.print("Enter age : ");
        int age = input.nextInt();
        //-----weight-----//
        System.out.print("Enter weight in pounds : ");
        double weight = input.nextDouble();
        //-----height-----//
        System.out.println("Enter height in inches => ");
        System.out.print("feet : ");
        double feet = input.nextDouble();
        System.out.print("inches : ");
        double inches = input.nextDouble();

        BMI bmi = new BMI(name,age,weight,feet,inches);
        System.out.printf("The BMI for " + bmi.getName() + " is " + bmi.getBMI() + " " + bmi.getStat());
        input.close();
    }
}
