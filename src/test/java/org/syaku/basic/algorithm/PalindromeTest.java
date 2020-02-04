package org.syaku.basic.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * palindrome(회문) 앞에서 읽으나 뒤에서 읽으나 같은 문자열
 * @author Seok Kyun. Choi.
 * @since 2020/02/04
 */
class PalindromeTest {

    @Test
    public void test() {
        assertTrue(proc("토마토"));
        assertTrue(proc("귀엽귀"));
        assertTrue(proc("ABCCBA"));
        assertFalse(proc("토마다"));
        assertFalse(proc("ABCABC"));
    }

    private void p(char text) {
        System.out.println(text);
    }

    private boolean proc(String text) {
        if (text == null) {
            return false;
        }

        int count = text.length();

        if (count == 0) {
            return false;
        }

        for (int s = 0, e = count; s < count; s++, e--) {
            char sText = text.charAt(s);
            char eText = text.charAt(e - 1);
            if (sText != eText) {
                return false;
            }
//            p(sText);
//            p(eText);
        }

        return true;
    }

}