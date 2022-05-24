public class Var {
    public static void main(String[] args) {
// print out all numbers from 1 to 10
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++; // increased to 1
        }
        System.out.println();

// print out all even numbers from 20 to 0
        number = 20;
        while (number >= 0) {
            System.out.print(number + " ");
            number -= 2;
        }
        System.out.println();

        //count the sum of numbers from 1 to 87
        number = 1;
        int sum = 0;
        while (number <= 87) {
            sum = sum + number;
            number++;
        }
        System.out.println(sum);
    }
}
