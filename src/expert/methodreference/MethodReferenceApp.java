package expert.methodreference;

import java.util.*;

public class MethodReferenceApp {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Steve", 40),
                new Person("Brit", 22),
                new Person("Adam", 27),
                new Person("Anna", 32),
                new Person("Kumar", 91),
                new Person("Anna", 4),
                new Person("Anna", 12));

        people.stream()
                .sorted(PersonComparisonProvider::compareByNameAndAge)
                .forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(12, 23, 45, 45, 67, 12, 34, 87, 102);
        Set<Integer> numbersSet = CollectionTransformer.transform(numbers, HashSet::new);
        System.out.println(numbersSet);

        Set<Person> personSet = CollectionTransformer.transform(people, TreeSet::new);
        System.out.println(personSet);

    }
}
