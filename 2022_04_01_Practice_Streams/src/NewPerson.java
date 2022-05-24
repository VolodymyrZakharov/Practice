import java.io.PrintWriter;
import java.util.List;

public class NewPerson {
    private String name;
    private List<NewBankAccount> newBankAccounts;

    public NewPerson(String name, List<NewBankAccount> newBankAccounts) {
        this.name = name;
        this.newBankAccounts = newBankAccounts;
    }

    public String getName() {
        return name;
    }

    public List<NewBankAccount> getNewBankAccounts() {
        return newBankAccounts;
    }
}
