package  RBS_Bank_project;

public class Bank {
    
    public int account_number;  //attributes
    public double balance;
    //constructor
    
    public Bank(int account_number,double balance){
        this.account_number = account_number;   // this -> refers to current class instance variable
        this.balance = balance;
    } 


    public void deposit_amount(double amount){  //method to deposit amount
     
        if(amount > 0){
            balance += amount;
            System.out.print("amount deposited. New balance is: " + balance);
        }
        else{
            System.out.print("invalid amount");
        }
    }

    public void withdraw_amount(double amount){  //method to withdraw amount
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.print("amount withdrawn. New balance is: " + balance);
        }
        else{
            System.out.print("invalid amount");
        }
    }

    public void double_CheckBalance(){  //method to check balance
        System.out.println("your current balance is: " + balance);
    }
}