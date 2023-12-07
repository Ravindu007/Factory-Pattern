public class PersonalAccountFactory extends AccountFactory {
    @Override
    public BankAccount createAccount() {
        //object creation of the PersonalAccount
        return new PersonalAccount();
    }
}
