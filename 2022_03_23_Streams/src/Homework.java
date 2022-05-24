import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Homework {

    public static void main(String[] args) {

    }

    // Написать функцию, которая определяет, является ли число простым (boolean isPrime(int number)).
    // Простое число, это такое целое число, большее 1, которое делится только на себя и 1. Например, 2, 3, 5, 7, 11, 13, 17...
    // Использовать стримы (подсказка: метод IntStream.range)
    static boolean isPrime(int number) {
        return IntStream.range(2, number).allMatch(a -> number % a != 0);
    }

    // Есть 2 IntStream. Сделать третий стрим, который содержит числа из обоих стримов, делящиеся на 3 и на 5.
    // Стрим должен быть отсортирован, и два первых числа должны быть пропущены
    static IntStream aliquotTo3And5(IntStream one, IntStream two) {
        return IntStream.concat(one, two).filter(a -> a % 3 == 0 && a % 5 == 0).sorted().skip(2);
    }

    // Посчитать факториал (функция, которая принимает число и возвращает число). Решить с помощью стримов (метод reduce)
    static long returnFactorial(int number) {
        return LongStream.rangeClosed(1, number).reduce((x, y) -> x * y).getAsLong();
    }

    // Посчитать сумму нечетных числе от a до b
    static int sumOfOddNumbers(int a, int b) {
        return IntStream.rangeClosed(a, b).filter(number -> number % 2 != 0).reduce(Integer::sum).getAsInt();
    }

    // Есть class Transaction {String uuid, String state ("Cancelled", "Finished", "Processing"), long sum, long date}.
    // И есть class Account{String uuid, long balance, List<Transaction> transactions}.
    // Посчитать сумму денег всех отмененных транзакций для всех аккаунтов с балансом выше нуля.
    // Сигнатура ф-ии: long function(List<Account> accounts)
    static long task5(List<Account> accounts) {
        return accounts.stream()
                .filter(account -> account.getBalance() > 0)
                .flatMap(account -> account.getTransactions().stream())
                .filter(transaction -> transaction.getState().equals("Canceled"))
                .mapToLong(Transaction::getSum)
                .sum();
    }

    // Есть class Employee{String name, long Salary}, class Department{String name, String code, List<Employee> employees}.
    // Посчитать общее число работников, чья зарплата >= определенного порога для всех департаментов, чей code начинается с "111-".
    // int function(List<Department> accounts, long threshold)
    static int task6(List<Department> accounts, long threshold) {
        return (int) accounts.stream().filter(department -> department.getCode()
                        .startsWith("111"))
                .flatMap(department -> department.getEmployees()
                        .stream()).count();
    }

    // Eсть class Account{String uuid, long sum, bool isLocked}. Необходимо заблокировать аккунты со слишком большой суммой денег.
    // void function(List<Account> accounts, long threshold)
    static void task7(List<Account2> accounts, long threshold) {
        accounts.stream()
                .filter(a -> a.getSum() > threshold)
                .forEach(a -> a.setLocked(true));
    }
}
