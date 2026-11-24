package edu.sandiego.comp305;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void testReverseNormalString() {
        assertEquals("lexip", StringUtils.reverseString("pixel"));
    }

    @Test
    void testReverseEmptyString() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    void testReverseSingleChar() {
        assertEquals("a", StringUtils.reverseString("a"));
    }

}

