import java.util.Scanner;

public class Pro4_Tax {
    public static void main(String[] args){
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950}, // Single filer
            {16700, 67900, 137050, 20885, 372950}, // Married jointly// -or qualifying widow(er)
            {8350, 33950, 68525, 104425, 186475}, // Married separately
            {11950, 45500, 117450, 190200, 372950} // Head of household
        };

        Scanner input = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Filing Status");
        System.out.println("\t[0] - Single filer");
        System.out.println("\t[1] - Married jointly or qualifying widow(er)");
        System.out.println("\t[2] - Married separately");
        System.out.println("\t[3] - Head of household");

        System.out.print("Enter the filing status: ");
        int status = input.nextInt();
        if(status > 3 || status < 0){
            System.out.println("Error: invalid status");
            System.out.println("----------------------------------------------------------------------");
        }

        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        System.out.printf("Tax is %.2f", computeTax(income, brackets[status], rates));
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------------");
        input.close();
    }

    static double computeTax(double income, int[] bracket, double[] rates){
        double tax = 0;

        if (income <= bracket[0])
        tax = income * rates[0];

        else if(income <= bracket[1])
        tax = bracket[0] * rates[0] + (income - bracket[0]) * rates[1];

        else if(income <= bracket[2])
        tax = bracket[0] * rates[0] + (bracket[1] - bracket[0]) * rates[1] 
              + (income - bracket[1]) * rates[2];

        else if (income <= bracket[3])
        tax = bracket[0] * rates[0] + (bracket[1] - bracket[0]) * rates[1] 
              + (bracket[2] - bracket[1]) * rates[2] + (income - bracket[2]) * rates[3];

        else if(income <= bracket[4])
        tax = bracket[0] * rates[0] + (bracket[1] - bracket[0]) * rates[1] 
              + (bracket[2] - bracket[1]) * rates[2] + (bracket[3] - bracket[2]) * rates[3] 
              + (income - bracket[4]) * rates[4];

        else
        tax = bracket[0] * rates[0] + (bracket[1] - bracket[0]) * rates[1] 
              + (bracket[2] - bracket[1]) * rates[2] + (bracket[3] - bracket[2]) * rates[3] 
              + (bracket[4] - bracket[3]) * rates[4] + (income - bracket[4]) * rates[5];
        return tax;
    }
}
