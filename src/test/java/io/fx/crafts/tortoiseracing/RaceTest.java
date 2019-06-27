package io.fx.crafts.tortoiseracing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RaceTest {

    // given
    private static Stream<Arguments> speedsAndLeadAndExpectedResult() {
        return Stream.of(
                arguments( speedA(8),   speedB(10),  leadA(0),  expectedResultInHourMinutesSeconds(0, 0, 0)),
                arguments( speedA(1),   speedB(1),   leadA(2),  expectedResultNull()),
                arguments( speedA(1),   speedB(0),   leadA(2),  expectedResultNull()),
                arguments( speedA(720), speedB(850), leadA(70), expectedResultInHourMinutesSeconds(0, 32, 18)),
                arguments( speedA(80),  speedB(91),  leadA(37), expectedResultInHourMinutesSeconds(3, 21, 49))
        );
    }

    @ParameterizedTest
    @MethodSource("speedsAndLeadAndExpectedResult")
    public void givenSpeedsAndLeadWhenExecuteRaceThenReturnsExpectedResult(int speedA, int speedB, int leadA, int[] expectedResult) {
        // when
        int[] actualResultInHourMinutesSeconds = Race.computeCrossTime(speedA, speedB, leadA);
        // then
        System.out.println("actual=" + Arrays.toString(actualResultInHourMinutesSeconds) + ", expected=" + Arrays.toString(expectedResult));
        assertArrayEquals(expectedResult, actualResultInHourMinutesSeconds);
    }

    // private explicit functions //

    private static int speedA(int speed) {
        return speed;
    }

    private static int speedB(int speed) {
        return speed;
    }

    private static int leadA(int leadA) {
        return leadA;
    }

    private static int[] expectedResultInHourMinutesSeconds(int... hourMinutesSeconds) {
        return hourMinutesSeconds;
    }

    private static Object expectedResultNull() {
        return null;
    }
}
