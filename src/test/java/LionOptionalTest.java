import com.example.AnimalHelper;
import com.example.Lion;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class LionOptionalTest {

    @RunWith(Parameterized.class)
    public static class doesHaveManeTest {
        private final String firstValue;
        private final Feline secondValue;
        private final boolean expected;

        public doesHaveManeTest(String firstValue, Feline feline, boolean expected) {
            this.firstValue = firstValue;
            this.secondValue = feline;
            this.expected = expected;
        }
        @Parameterized.Parameters
        public static Object[] getManeData() {
            return new Object[][] {
                    {AnimalHelper.MALE, true},
                    {AnimalHelper.FEMALE, false},
            };
        }
        @Test
        public void doesHaveManeTest() throws Exception {
            Lion lion = new Lion(firstValue, secondValue);
            boolean actual = lion.doesHaveMane();
            Assert.assertEquals(expected, actual);
        }
    }
    private Feline feline;
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();
    @Test
    public void doesHaveManeExceptionTest() throws Exception {
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage(AnimalHelper.UNSUPPORTED_CHOICE_ERROR_MESSAGE);
        Lion lion = new Lion("СамецСамка", feline);
    }

}
