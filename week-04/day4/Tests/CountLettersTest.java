import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class CountLettersTest {


    @Test
    public void countChar_HashMap_Test (){

        Map<Character, Integer> sampleDictionary = new HashMap<>();
        sampleDictionary.put('b', 4);
        sampleDictionary.put('l', 4);
        sampleDictionary.put('a', 4);

        CountLetters play = new CountLetters();

        assertEquals(sampleDictionary, play.countChar("blablablabla"));

    }

    @Test
    public void countChar_HashMapKey_Contains_Test (){

        Map<Character, Integer> sampleDictionary = new HashMap<>();

        CountLetters play = new CountLetters();
        sampleDictionary = play.countChar("tratratratra");

        assertTrue(sampleDictionary.containsKey('t'));

    }

    @Test
    public void countChar_HashMapKey_NotContains_Test (){

        Map<Character, Integer> sampleDictionary = new HashMap<>();

        CountLetters play = new CountLetters();
        sampleDictionary = play.countChar("tratratratra");

        assertFalse(sampleDictionary.containsKey('k'));

    }

    @Test
    public void countChar_HashMap_Size_Test (){

        Map<Character, Integer> sampleDictionary = new HashMap<>();

        CountLetters play = new CountLetters();
        sampleDictionary = play.countChar("tratratratra");

        assertEquals(3, sampleDictionary.size());

    }

}
