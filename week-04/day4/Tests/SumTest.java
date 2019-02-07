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
    public void sumOfElements_Test (){

        Integer[] numberList = new Integer[]{9, -4, 3, -4};
        List<Integer> initials = Arrays.asList(numberList);


        Sum newSum = new Sum();
        assertEquals(4, newSum.sumOfElements(initials));
    }
}
