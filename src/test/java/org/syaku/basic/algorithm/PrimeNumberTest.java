package org.syaku.basic.algorithm;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 최대소수 구하기 1(자연수)과 자기 자신 밖에 나눠어 떨어지지 않는 1 이외의 정수
 * @author Seok Kyun. Choi.
 * @since 2020/02/04
 */
public class PrimeNumberTest {

    @Test
    public void test() {
        Set<Integer> result = proc(100);
        assertEquals(25, result.size());
        result.forEach(System.out::println);
    }

    private Set<Integer> proc(int number) {
        Set<Integer> result = new LinkedHashSet<>();

        // 1을 제외한 수
        for (int i = 2; i <= number; i++) {
            // 자기 자신 밖에 나눠어 지지 않는 정수 검사
            if (isChecked(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isChecked(int number) {
        // number 보다 작은 수 중 나눠지는 지 여부 확인
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
