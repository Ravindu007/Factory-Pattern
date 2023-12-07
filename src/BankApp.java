public class BankApp {

    public static void main(String[] args) {
        //personal account
        AccountFactory personal_account_factory = new PersonalAccountFactory();  //referred to base class variable
        BankAccount personal_Account = personal_account_factory.createAccount();

        personal_Account.getBalance();

        //foreign account
        AccountFactory foreign_account_factory = new ForignAccountFactory();
        BankAccount foreign_account = foreign_account_factory.createAccount();

        foreign_account.deposit();


    }
}
