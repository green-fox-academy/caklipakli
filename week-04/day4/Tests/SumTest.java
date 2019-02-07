import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void sumOfElements_0values_Test (){

        Integer[] numberList = new Integer[]{0, 0, 0, -0};
        List<Integer> initials2 = Arrays.asList(numberList);
        Sum newSum = new Sum();
        assertEquals(0, newSum.sumOfElements(initials2));
    }

    @Test
    public void sumOfElements_SomeDifferentValue_Test () {

        Sum newSum = new Sum();
        Integer[] numberList = new Integer[]{9, -4, 3, -4};
        List<Integer> initials = Arrays.asList(numberList);
        assertEquals(4, newSum.sumOfElements(initials));
    }


    @Test (expected = NullPointerException.class)
    public void sumOfElements_NullList_ReturnsThatValue() {
        Sum newSum = new Sum();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(null));
        newSum.sumOfElements(input);
    }
}
