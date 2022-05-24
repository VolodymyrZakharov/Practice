public class BankAccount {
private String IBAN;
private Person person;

    public BankAccount(String IBAN, Person person) {
        this.IBAN = IBAN;
        this.person = person;
    }

    public String getIBAN() {
        return IBAN;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return IBAN;
    }
}
