import SecretAgents.CIA;
import SecretAgents.FBI;
import SecretAgents.SBU;
import SecretAgents.SecretAgentClass;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException {



        /*
        String type = "Dog";
        Animal cat = (Animal) Class.forName(type).getConstructor().newInstance();
        System.out.println(cat.sound());

        AnimalStore a = new AnimalStore();
        System.out.println(a.animalSound("Cat").sound());
*/
        long a = System.currentTimeMillis();

        FBI one = new FBI(36, "Vova");
        System.out.println(one.getAge());
        CIA two = new CIA(34, "Vasya");
        SBU three = new SBU(27, "Petya");
        System.out.println(SecretAgentClass.getCount());


        Properties p = new Properties();
        p.setProperty("name", "Ganesh Chowdhary Sadanala");
        p.setProperty("email", "ganeshs.gfg@gmail.com");
        p.store(new FileWriter("info.properties"),
                "GeeksforGeeks Properties Example");


        Properties pr = System.getProperties();
        Set set = p.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " = "
                    + entry.getValue());
        }

        LinkedList<Integer> list = getRandomList(256);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        long b = System.currentTimeMillis();
        System.out.println("result is " + (b - a));

        RandomGenerator randomGenerator = new RandomGenerator(new RangeRandomRule(1, 10));
        System.out.println(randomGenerator.generate(5));

        try {
            System.out.println(divide(10, 2));
        } catch (CustomArithmeticException exep) {
            System.out.println("value is zero");
        }

        String res = (String) getValue("fgg");
        String res1 = getValueGen("ghgh");
        Integer res2 = getValueGen(4);

        GenerifiedClass generifiedClass = new GenerifiedClass<>();
        System.out.println(generifiedClass.get(5));

        ServerInfo some = new ServerInfo();
        some.update(2000, "local_host");
        System.out.println(some);

        Cars mersedes = new Cars(1, "mersedes");
        Cars bmw = new Cars(1, "mersedes");
        System.out.println(mersedes.equals(bmw));

        Set set1 = new HashSet();
        set1.add(mersedes);
        set1.add(bmw);
        System.out.println(set1);
        Box1 dff = new Box1(2);
        System.out.println(dff);

        List<Integer> list4 = new ArrayList<>();
        list4 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list4);
        list4.set(0, 0);
        System.out.println(list4);
        List<Integer> az = null;

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(alphabet.indexOf('A')); // 0

        List rawList = new ArrayList();
        List<String> listGeneric = new ArrayList<>();
        rawList = listGeneric;
        rawList.add(12);
        String s = listGeneric.get(0);

        int c = 5;
        int v = 5;
        System.out.println(c==v);

    }



    static class GenerifiedClass<T> {
        public T get(T o) {
            return o;
        }
    }

    public static Object getValue(Object o) {
        return o;
    }

    public static <T> T getValueGen(T o) {
        return o;
    }

    private static LinkedList<Integer> getRandomList(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add((int) (Math.random() * 256));
        }
        return list;
    }

    private static int divide(int a, int b) {
        if (b == 0)
            throw new CustomArithmeticException();
        return a / b;
    }

}
