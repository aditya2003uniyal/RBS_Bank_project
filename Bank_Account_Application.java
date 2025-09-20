package RBS_Bank_project;

public class Bank_Account_Application {

    public static void main(String[] args) {
        bank rbsAccount1 = new bank();  //creating object of bank class
        rbsAccount1.account_number = 100;
        rbsAccount1.balance = 10000;
        rbsAccount1.deposit_amount(5000);

        bank rbsAccount2 = new bank();  //creating another object of bank class
        rbsAccount2.account_number = 101;
        rbsAccount2.balance = 20000;    
        rbsAccount2.withdraw_amount(15000);
        rbsAccount2.double_CheckBalance();
        

    }
}
