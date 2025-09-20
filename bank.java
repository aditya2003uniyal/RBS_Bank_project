package RBS_Bank_project;

public class bank {
    
    int account_number;  //attributes
    double balance;

    public void deposit_amount(double amount){  //method to deposit amount
     
        if(amount>0){
            balance=+amount;
            System.out.print("amount deposited.New balacne is :" + balance);
        }
    
        else{
            System.out.print("invalid amount");
        }

    }

     public void withdraw_amount(double amount){  //method to withdraw amount
            
            if(amount>0 && amount<=balance){
                balance =- amount;
                System.out.print("amount withdrawn.New balance is :" + balance);
            }
           
            else{
                sysutem.out.print("invalid amount");
            }
        }

        public void double_CheckBalance(){  //method to check balance
            System.out.println("your current balance is :" + balance);
        }
}
