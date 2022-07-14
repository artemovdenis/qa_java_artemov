import com.example.AnimalHelper;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(AnimalHelper.MALE, feline);
        Mockito.when(lion.getFood()).thenReturn(List.of(AnimalHelper.MEAT));
        Assert.assertEquals(List.of(AnimalHelper.MEAT), lion.getFood());
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        //Arrange
        boolean expectedResult = true;
        Lion lion = new Lion(AnimalHelper.MALE, feline);

        //Act
        boolean actualResult = lion.doesHaveMane();

        //Assert
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion(AnimalHelper.MALE, feline);
        Mockito.when(feline.getKittens()).thenReturn(100);
        Assert.assertEquals(100, lion.getKittens());
    }
}
