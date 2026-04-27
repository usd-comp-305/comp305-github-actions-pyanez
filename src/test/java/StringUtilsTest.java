import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {
    @Test
    public void testStringIsReversed(){
        assertEquals("ynnep", StringUtils.reverseString());
    }
    @Test
    public void testStringIsNotReversed(){
    }
    @Test
    public void testReverseSingleChar(){
    }
    @Test
    public void testReverseEmptyString(){
    }
}
