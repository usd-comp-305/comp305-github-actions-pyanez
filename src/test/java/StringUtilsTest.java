import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringUtilsTest {
    @Test
    public void testStringIsReversed(){
        assertEquals("ynnep", StringUtils.reverseString("penny"));
    }

    @Test
    public void testReverseSingleChar(){
        assertEquals("p", StringUtils.reverseString("p"));
    }

    @Test
    public void testReverseEmptyString(){
        assertEquals("", StringUtils.reverseString(""));
    }
}
