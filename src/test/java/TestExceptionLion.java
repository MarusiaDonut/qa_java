import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

public class TestLion {
    Feline feline;
    @Test()
    public void constructorThrowsExceptionOnUnsupportedSex() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Тест", feline);
            Assert.assertFalse(lion.doesHaveMane());
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}
