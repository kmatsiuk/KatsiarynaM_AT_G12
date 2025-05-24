package homework.day11.junit;

import homework.day11.DayOfWeekUtility;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Enclosed.class)
public class DayOfWeekTestJ {

    @RunWith(Parameterized.class)
    public static class DayOfWeekParamTest {

        private final int input;
        private final String expected;

        public DayOfWeekParamTest(int input, String expected) {
            this.input = input;
            this.expected = expected;
        }

        @Parameterized.Parameters(name = "{index}: getDayOfWeek({0}) = {1}")
        public static Collection<Object[]> testData() {
            return Arrays.asList(new Object[][]{
                    {1, "Monday"},
                    {2, "Tuesday"},
                    {3, "Wednesday"},
                    {4, "Thursday"},
                    {5, "Friday"},
                    {6, "Saturday"},
                    {7, "Sunday"},
                    {0, "Invalid day number. Please provide a number between 1 and 7."},
                    {8, "Invalid day number. Please provide a number between 1 and 7."}
            });
        }

        @Test
        public void testGetDayOfWeek() {
            assertEquals("Failed for input: " + input, expected, DayOfWeekUtility.getDayOfWeek(input));
        }
    }
}
