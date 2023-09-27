import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class map_filter_reduce {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Map: Square each number
        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        // Filter: Select even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        // Reduce: Sum of all numbers
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        // Sorted: Sort numbers in descending order
        List<Integer> sortedDescending = numbers.stream()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());

        System.out.println("Squared Numbers: " + squaredNumbers);
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Sum: " + sum);
        System.out.println("Sorted Descending: " + sortedDescending);
    }
}
