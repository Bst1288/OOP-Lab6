import java.util.Scanner;

public class Pro6_ATM {
    public static void main(String[] args){
        boolean status = true;
        Account[] accounts = new Account[10];
        for(int i = 0; i < 10; i++){
            accounts[i] = new Account(i,100);
        }
        Scanner input = new Scanner(System.in);
        int id = 0;
        while(status){
            while(status){
                System.out.print("Enter an id : ");
                id = input.nextInt();
                if(id >= 0 && id <= 9){
                    break;
                }
            }
            while(status){
                System.out.print(
                    "Main menu\n" +
                            "1: check balance\n" +
                            "2: withdraw\n" +
                            "3: deposit\n" +
                            "4: exit\n" +
                            "Enter a choice: ");
                int option = input.nextInt();
                switch(option){
                    case 1:
                    System.out.println("The balance is "+accounts[id].getBalance());
                    System.out.println(" ");
                    break;

                    case 2:
                    System.out.print("an amount to withdraw: ");
                    double withdraw = input.nextDouble();
                    if(accounts[id].getBalance()<withdraw || withdraw < 0){
                        System.out.println("You can't use this value.");
                    }
                    else{
                        accounts[id].withdraw(withdraw);
                        System.out.println(" ");
                    }
                    break;

                    case 3:
                    System.out.print("an amount to deposit: ");
                    double deposit = input.nextDouble();
                    if(deposit < 0){
                        System.out.println("You can't use this value.");
                    }
                    else{
                        accounts[id].deposit(deposit);
                        System.out.println(" ");
                    }
                    break;

                    case 4:
                    System.out.println("End of Program.");
                    status = false;
                    break;
                }
            }
        }
        input.close();
    }
}
