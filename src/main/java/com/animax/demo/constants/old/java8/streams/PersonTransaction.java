package com.animax.demo.constants.old.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*


Given a list of Person objects, where each Person has a list of Transaction objects,
write a Java method to find the total sum of transactions for all persons under the age of 30
 */
public class PersonTransaction {
    public static void main(String[] args) {
        List<Transaction> txn = Arrays.asList(new Transaction(10), new Transaction(20));

        List<Transaction> txn1 = Arrays.asList(new Transaction(30), new Transaction(40));

        List<Transaction> txn2 = Arrays.asList(new Transaction(50), new Transaction(20));

        List<Person> list = Arrays.asList(

                new Person("Ankit", 25, txn),
                new Person("Rahul", 21, txn1),
                new Person("Saurav", 32, txn2)
        );

        int total = list.stream().filter(p -> p.getAge() < 30)
                .flatMap(p -> p.getTransactions().stream()).map(Transaction::getAmount)
                .reduce(Integer::sum).get();

        System.out.println(total);

        Optional<Integer> totalAmountUnderThirtyOptional = list.stream()
                .filter(p -> p.getAge() < 30) // Filter people under the age of thirty
                .flatMap(p -> p.getTransactions().stream()) // Flatten the stream of transactions
                .map(Transaction::getAmount) // Map each transaction to its amount
                .reduce(Integer::sum);

        System.out.println(totalAmountUnderThirtyOptional.get());

        int totalAmountUnderThirty = list.stream()
                .filter(p -> p.getAge() < 30) // Filter people under the age of thirty
                .flatMap(p -> p.getTransactions().stream()) // Flatten the stream of transactions
                .mapToInt(Transaction::getAmount) // Map each transaction to its amount
                .sum(); // Calculate the sum of all amounts

        System.out.println("Total amount of transactions by people under 30: " + totalAmountUnderThirty);

    }
}
