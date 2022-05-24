import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        System.out.println("put in the number of countries");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        System.out.println("put in the number of cities");
        int k = sc1.nextInt();


        for (int i = 1; i <= n; i++) {
            System.out.println("put in the country");
            Scanner sc2 = new Scanner(System.in);
            String country = sc2.nextLine();
            for (int j = 1; j <= k; j++) {
                System.out.println("put in the city");
                String city = sc2.nextLine();
                map.put(city, country);
            }
        }

        System.out.println(map.containsKey("Sochi"));

    }
}
