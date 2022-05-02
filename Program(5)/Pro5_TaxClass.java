import java.util.Scanner;

public class Pro5_TaxClass {
    public static void main(String[] args){
        Tax tax = new Tax();
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
        tax.setFilingStatus(status);
        tax.setTaxableIncome(income);
        System.out.println("Tax is " + tax.getTax());
        System.out.println(" ");
        System.out.print("----------------------------------------------------------------------");
        input.close();
    }
}