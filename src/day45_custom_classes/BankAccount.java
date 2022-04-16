package day45_custom_classes;

public class BankAccount {
      /*
      ======= Task 2 =======
      	className --- > BankAccount   (instance vs Local  Var | instance Methods | Constr)

              fields / attributes / data that can have are:
                      1. AccountHolder, 2. AccountNumber, 3. Balance

              Methods (Actions)
                  1. CheckBalance,   2. deposit,  3. withdraw

              requirements:
                  1. user should be able to deposit money into their account --> deposit(double amount);
                      1.1 if the amount is less than or equal to 0
                               "Depositing amount can not be zero or negative"
                  2. user should be able to withdraw money from their account --> withdraw(double amount);
                      2.1 if the withdrawing account is greater than available balance
                                "Insufficient balance "
                      2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
                                "Withdrawing amount can not be negative or zero"
                  3. user should be able to see their balance --> checkBalance();
                      Example Output :
                              As of today , "+$accountName+"'  available balance is: "+$availableBalance
     */

    String accountHolder;
    String accountNumber;
    double availableBalance = 0;

    public BankAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;

    }


    public void deposit(double amount) {

        if (amount <= 0) {
            System.err.println("Depositing amount can not be zero or negative");
        } else {
            availableBalance += amount;

        }
    }

    public void withdraw(double amount) {
        if (amount > availableBalance) {
            System.err.println("Insufficient balance");

        } else if (amount <= 0) {
            System.err.println(" Withdrawing amount can not be negative or zero");

        } else {

            availableBalance -= amount;
        }
    }

    public void checkBalance(){
        System.out.println("As of today ,"+ accountHolder+"  available balance is " + availableBalance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", availableBalance=" + availableBalance +
                '}';
    }
}
