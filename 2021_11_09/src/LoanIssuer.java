public class LoanIssuer {

    String name;
    String surname;
    boolean isLazy;
    boolean isKind;

    public LoanIssuer(String name, String surname, boolean isLazy, boolean isKind) {
        this.name = name;
        this.surname = surname;
        this.isLazy = isLazy;
        this.isKind = isKind;
    }

    public boolean toProvide(LoanUser user) {
        //TODO implement
        //Если работник ленивый, он одобрит кредит в случае, если у клиента зп больше 20000 в год.
        //Если работник неленивый и добрый, он оформит кредит, если зп больше 20000 и клиенту не больше 70
        //Если работник неленивый и злой, он оформит кредит, если зп больше 20000 и клиенту не больше 50.

        if (user.annualSalary < 20000)
            return false;

        if (this.isLazy)
            return true;

        if (user.age <= 50)
            return true;

        if (this.isKind && user.age <= 70)
            return true;

        return false;
    }
}