public class ForignAccountFactory extends AccountFactory{
    @Override
    public BankAccount createAccount() {
        return new ForignAccount();
    }
}
