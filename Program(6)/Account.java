import java.util.Date;

public class Account {
    private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

    Account(){
        this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
    }

    Account(int id, double balance){
        this.id = id;
		this.balance = balance;
		this.dateCreated = new Date();
    }

    void setId(int id){
		this.id = id;
	}

    void setBalance(double balance){
		this.balance = balance;
	}

    void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}

    int getId(){
		return id;
	}

    double getBalance(){
        return balance;
    }

    double getAnnualInterestRate(){
		return annualInterestRate;
	}

    String getDateCreated(){
		return dateCreated.toString();
	}

    double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}

    double getMonthlyInterest(){
		return balance * (getMonthlyInterestRate() / 100);
	}

    void withdraw(double amount){
		balance -= amount;
	}

    void deposit(double amount){
		balance += amount;
	}
}
