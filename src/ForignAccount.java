public class ForignAccount  implements BankAccount{
    @Override
    public void getBalance() {
        System.out.println("Getting balance of Foreign Account");
    }

    @Override
    public void deposit() {
        System.out.println("Deposit money Foreign Account");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawing from Foreign Account");
    }
}
