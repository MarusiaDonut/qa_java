import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    @Mock
    Cat cat;

    @Mock
    Feline feline;

    @Test
    public void getSoundTest() {
        Mockito.when(cat.getSound()).thenReturn("Мяв");
        Assert.assertEquals(("Мяв"), cat.getSound());
    }

    @Test
    public void getFoodTest() throws Exception {
        Cat cat1 = new Cat(feline);
        Mockito.when(cat1.getFood()).thenReturn(List.of("Трава", "Различные растения"));
        Assert.assertEquals((List.of("Трава", "Различные растения")), cat1.getFood());
    }
}
