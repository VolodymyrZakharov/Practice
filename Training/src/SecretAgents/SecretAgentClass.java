package SecretAgents;

public abstract class SecretAgentClass {
    private int age;
    private String name;
   protected static int count = 0;

    public SecretAgentClass(int age, String name) {
        this.age = age;
        this.name = name;
        count++;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static String getCount() {
        return "Total quantity of agents " + count;
    }
}
