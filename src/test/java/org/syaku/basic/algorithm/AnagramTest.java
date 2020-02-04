package org.syaku.basic.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 두개의 알파벳 구성이 순서와 상관없이 조합이 같은 경우 성립
 * listen == silent
 * abc == bca
 * bbbaaa != ababac
 * aaa == aaa
 * @author Seok Kyun. Choi.
 * @since 2020/02/04
 */
public class AnagramTest {

    @Test
    public void test() {
        assertTrue(proc("listen", "silent"));
        assertTrue(proc("abc", "bca"));
        assertFalse(proc("bbbaaa", "ababac"));
        assertTrue(proc("aaa", "aaa"));

    }

    private boolean proc(String a, String b) {
        char[] aa = a.toUpperCase().toCharArray();
        char[] bb = b.toUpperCase().toCharArray();

        Arrays.sort(aa);
        Arrays.sort(bb);

        String aaa = new String(aa);
        String bbb = new String(bb);

        return Objects.equals(aaa, bbb);
    }
}
