import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void ifAnagram_0values_Test (){

        Anagram twoStrings = new Anagram();
        assertTrue(twoStrings.ifAnagram("",""));
    }

    @Test
    public void ifAnagram_True_Test (){

        Anagram twoStrings = new Anagram();
        assertTrue(twoStrings.ifAnagram("baba","abba"));
    }

    @Test
    public void ifAnagram_DifferentLenght_Test (){

        Anagram twoStrings = new Anagram();
        assertFalse(twoStrings.ifAnagram("bababa","blablabla"));
    }
    @Test
    public void ifAnagram_SameLenghtFalse_Test (){

        Anagram twoStrings = new Anagram();
        assertFalse(twoStrings.ifAnagram("bababa","blblbl"));
    }
}
