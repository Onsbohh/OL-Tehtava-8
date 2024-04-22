import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testit {
    private final TimeUtils timeUtils = new TimeUtils();

    @ParameterizedTest(name = "secToTime({0}) = {1}")
    @CsvSource({
        "0, 0:00:00",
        "1, 0:00:01",
        "-1, -1",
        "60, 0:01:00",
        "3600, 1:00:00",
        "86400, 24:00:00",
        "86399, 23:59:59",
        "172800, -1",
        "3665, 1:01:05",
    })
    void testSecToTime(int a, String expected) {
        assertEquals(expected, timeUtils.secToTime(a));
    }
}
