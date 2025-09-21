package RBS_Bank_project;
// import RBS_Bank_project.bank;

public class Bank_Account_Application {

    public static void main(String[] args) {
        Bank rbsAccount1 = new Bank(100,1000);  //creating object of bank class
        // rbsAccount1.account_number = 100;
        // rbsAccount1.balance = 10000;
        rbsAccount1.deposit_amount(5000);

        Bank rbsAccount2 = new Bank(101,20000);  //creating another object of bank class
        // rbsAccount2.account_number = 101;
        // rbsAccount2.balance = 20000;    
        rbsAccount2.withdraw_amount(15000);
        rbsAccount2.double_CheckBalance();
        

    }
}
