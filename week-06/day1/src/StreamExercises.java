import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamExercises {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        List<Integer> squaredNumbers = numbers.stream()
                .filter(n -> n > 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squaredNumbers);


        List<Integer> numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);

        List<Integer> squaredNumbersBiggerThan20 = numbers2.stream()
                .map(n -> n * n)
                .filter(n -> n > 20)
                .collect(Collectors.toList());
        System.out.println(squaredNumbersBiggerThan20);

        List<Integer> numbers3 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);


        double oddListAverage = numbers3.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(n -> n)
                .summaryStatistics()
                .getAverage();
        System.out.println(oddListAverage);

    }
}
