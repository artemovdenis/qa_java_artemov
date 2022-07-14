import com.example.AnimalHelper;
import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void getSoundReturnCorrectValue() {
        String expectedSound = AnimalHelper.CAT_SOUND;
        Cat cat = new Cat(feline);
        String actualSound = cat.getSound();

        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(cat.getFood()).thenReturn(List.of(AnimalHelper.MOUSE));
        Assert.assertEquals(List.of(AnimalHelper.MOUSE), cat.getFood());
    }

}


