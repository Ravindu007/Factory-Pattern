public class PersonalAccount implements BankAccount {
    @Override
    public void withdraw() {
        System.out.println("Withdraw Money of personal account");
    }

    @Override
    public void deposit() {
        System.out.println("Deposit money to personal account");
    }

    @Override
    public void getBalance() {
        System.out.println("Get balance of personal account");
    }
}
