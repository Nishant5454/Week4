package com.problems.Exception.bankTransaction;
class Bank {
    private static int balance;

    Bank(int balance) {

        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public int getWithdrawl(int amount) throws InsuffcientBalanceException, IllegalArgumentException {
        if (amount < balance) {
            // System.out.println("Innnsufficient Balance");
            throw new InsufficientBalanceException("Insuffcient Balance");;
        }
        if (amount < 0) {
            // System.out.println("Insufficient Balance");
            throw new InsufficientBalanceException("Invalid amount");
        }
        return getBalance() - amount;
    }
}

class InsuffcientBalanceException extends Exception{
    public InsuffcientBalanceException(String message){
        super(message);
}
}

public class bankTransaction {
    public static void withdraw(double amount){
        Bank bank=new Bank(1000);
        int withdrawl=bank.getWithdrawl(900);
        System.out.println("The ");
    }
}
