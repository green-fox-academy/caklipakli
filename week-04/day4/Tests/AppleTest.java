import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    @Test
        public void getApple_Test() {

        Apples newApple = new Apples("apple");

        assertEquals("apple", newApple.getApple());
    }

}
