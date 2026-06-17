package Java8.TypesOfMethodReference;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodArbitrary {
    public static void main(String[] args){
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Elderberry");

        fruits.stream().map(String::toUpperCase).forEach(System.out::println);

        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");
        numbers.sort(String::compareToIgnoreCase);
        System.out.println(numbers);

        List<String> num = Arrays.asList("10", "2", "30", "4", "5");
        num.stream().map(Integer::parseInt).sorted().forEach(System.out::println);

    }
}
