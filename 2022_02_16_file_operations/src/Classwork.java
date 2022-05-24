import java.io.*;
import java.util.*;

public class Classwork {
    //1 есть текстовый файл
    // 1
    // 2
    // 3
    // 4
    // 5
    // прочитать его и вернуть сумму всех чисел

    public static int task1(String filename) throws IOException {
        int sum = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line = br.readLine();
            while (line != null) {
                sum = sum + Integer.parseInt(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sum;
    }

    //2. написать метод, возвращающий самую длинную строкув текстовом файле
    //aa
    //bbbbb
    //cc
    public static String task2(String fileName) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        if (line != null) {
            list.add(0, line);
        }
        while (line != null) {
            if (list.get(0).length() < line.length()) {
                list.add(0, line);
            }
            line = br.readLine();
        }
        return list.get(0);
    }

    //3.есть текстовый файл содержащий имена и возраст людей в каждой строке,такого вида:
    // Petr, 35
    // Semen, 3
    // Petr, 35
    //написать метод, возвращающий список людей (имена и возраст) старше 18 лет,
    // отсортированный по возрасту
    public static List<Person> task3(String fileName) throws IOException {
        List<Person> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        while (line != null) {
            String[] stringArray = line.split(", ");
            if (Integer.parseInt(stringArray[1]) > 18) {
                Person person = new Person(stringArray[0], Integer.parseInt(stringArray[1]));
                list.add(person);
            }
            line = br.readLine();
        }
        Collections.sort(list, Person::compareTo);
        return list;
    }

    //4. Записать в файл обьекты класса Person (name, age) в таком виде: name, age.//"Petr", 35// Semen, 3// Petr, 35
    public static void task4(List<Person> list, String filename) throws IOException {
        try (PrintWriter pw = new PrintWriter(filename);) {
            for (Person p : list) {
                pw.println(p.name + ", " + p.age);
            }
        }
    }

    // 5.
// есть файл содержащий строки такого вида name,surname,equipment,price. Например:// Evgeny,Grazhdanskiy,Notebook,500.
// Имена и фамилии могут повторяться. Создать новый файл// содержащий строки вида : name, sum , где name это имя и фамилия
// из входящео файла, а sum// это сумма цен товаров по этому человеку.// например входящие записи Petr,Ivanov,TVSet, 500//
// Petr,Ivanov,Computer,200// на выходе Petr Ivanov, 700// public static void listToListModifiedFile (String inFile, String outFile)
    public static HashMap<String, Integer> task5(List<People> list) {
        HashMap<String, Integer> hm = new HashMap();
        for (People p : list) {
            StringBuilder sb = new StringBuilder(p.name + " " + p.familyName);
            String key = String.valueOf(sb);
            if (hm.containsKey(key)){
                hm.put(key, hm.get(key) + p.price);
            } else hm.put(key, p.price);
        }
        return hm;
    }
}
