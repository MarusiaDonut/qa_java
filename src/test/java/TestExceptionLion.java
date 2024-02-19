import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestExceptionLion {
    Feline feline;
    @Test()
    public void ThrowsExceptionOnUnsupportedMale() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Тест", feline);
            Assert.assertFalse(lion.doesHaveMane());
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}
