public class BankApp {

    public static void main(String[] args) {
        AccountFactory personal_account_factory = new PersonalAccountFactory();  //referred to base class variable
        BankAccount personal_Account = personal_account_factory.createAccount();


        personal_Account.getBalance();
    }
}
