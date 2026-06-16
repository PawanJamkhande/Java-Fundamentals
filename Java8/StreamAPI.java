package Java8;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
/*
Stream API : It is a new feature in Java 8 that allows you to process collections of data in a functional style. 
               It provides a way to perform operations on collections of data, such as filtering, mapping, and reducing, in a more concise and readable way.
               It is not a data structure but it is a sequence of elements that can be processed in parallel or sequentially.
               It is not a collection but it is a view of a collection that can be processed in parallel or sequentially.
               It is not a stream of data but it is a stream of elements that can be processed in parallel or sequentially.
        1. Intermediate operations : It is an operation that returns a stream and it is used to transform the stream. 
                                    It is lazy and it is not executed until a terminal operation is invoked on the stream.
                                    transform the stream and return a new stream.
                                   filter() - It is used to filter the elements of the stream based on a given predicate. It returns a new stream that contains only the elements that match the predicate.
                                    map() - It is used to transform the elements of the stream based on a given function. It returns a new stream that contains the transformed elements.
                                    sorted() - It is used to sort the elements of the stream based on a given comparator. It returns a new stream that contains the sorted elements.
                                    distinct() - It is used to remove duplicate elements from the stream. It returns a new stream that contains only the unique elements.
                                    limit() - It is used to limit the number of elements in the stream. It returns a new stream that contains at most the specified number of elements.
                                    skip() - It is used to skip a specified number of elements from the stream. It returns a new stream that contains the remaining elements.
                                    flatMap() - It is used to flatten a stream of collections into a single stream. It returns a new stream that contains all the elements from the nested collections.
        2. Terminal operations : It is an operation that returns a non-stream result and it is used to produce a result from the stream. 
                                It is eager and it is executed immediately when it
                                is invoked on the stream.
                                it produces the result and it is not a stream.
                                forEach() - It is used to perform an action on each element of the stream. It does not return a result and it is a terminal operation.
                                collect() - It is used to collect the elements of the stream into a collection or a single value. It returns a non-stream result and it is a terminal operation.
                                count() - It is used to count the number of elements in the stream. It returns a long value and it is a terminal operation.
                                reduce() - It is used to reduce the elements of the stream into a single value based on a given binary operator. It returns a non-stream result and it is a terminal operation.
                                findFirst() - It is used to find the first element of the stream that matches a given predicate. It returns an Optional value and it is a terminal operation.
                                findAny() - It is used to find any element of the stream that matches a given predicate. It returns an Optional value and it is a terminal operation.
                                min() - It is used to find the minimum element of the stream based on a given comparator. It returns an Optional value and it is a terminal operation.
                                max() - It is used to find the maximum element of the stream based on a given comparator. It returns an Optional value and it is a terminal operation.
*/
public class StreamAPI {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Intermediate operation : filter()
        List<Integer> evenNumbers = numbers.stream().collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);
        // Intermediate operation : map()
        List<Integer> squaredNumbers = numbers.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println("Squared Numbers: " + squaredNumbers);
        
        
        // Terminal operation : forEach()
        System.out.println("Numbers: ");
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();
        // Terminal operation : collect()
        List<Integer> oddNumbers = numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println("Odd Numbers: " + oddNumbers);
        // Terminal operation : count()
        long count = numbers.stream().filter(n -> n % 2 == 0).count();
        System.out.println("Count of Even Numbers: " + count);
        // Terminal operation : reduce()
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum of Numbers: " + sum);
        // Terminal operation : findFirst()
        Optional<Integer> firstEvenNumber = numbers.stream().filter(n -> n % 2 == 0).findFirst();
        System.out.println("First Even Number: " + firstEvenNumber.orElse(null));
        // Terminal operation : findAny()
        Optional<Integer> anyEvenNumber = numbers.stream().filter(n -> n % 2 == 0).findAny();
        System.out.println("Any Even Number: " + anyEvenNumber.orElse(null));
        // Terminal operation : min()
        Optional<Integer> minNumber = numbers.stream().min(Integer::compareTo);
        System.out.println("Minimum Number: " + minNumber.orElse(null));
        // Terminal operation : max()
        Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);
        System.out.println("Maximum Number: " + maxNumber.orElse(null));
    }
    
}
