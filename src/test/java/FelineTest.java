import com.example.AnimalHelper;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    private Feline feline;

    @Before
    public void setup() {
        feline = new Feline();
    }

    @Test
    public void getFamilyReturnsCorrectValue() {
        String expectedFamily = AnimalHelper.CATS;
        String actualFamily = feline.getFamily();

        assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensReturnsCorrectValue() {
        int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens();

        assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void eatMeatReturnsCorrectValue() throws Exception {
        List<String> expectedEatMeat = List.of(AnimalHelper.ANIMALS, AnimalHelper.BIRDS, AnimalHelper.FISH);
        List<String> actualEatMeat = feline.eatMeat();
        assertEquals(expectedEatMeat, actualEatMeat);
    }

}
