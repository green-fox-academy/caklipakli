import java.util.ArrayList;
import java.util.List;

public class Sum {

    int result;

    public int sumOfElements(List<Integer> numbers){

        if (numbers.equals(null)) {
            throw new NullPointerException();
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
