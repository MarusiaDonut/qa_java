import com.example.Feline;
import com.example.Predator;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import com.example.Cat;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    @Mock
    Feline feline;

    @Test
    public void foodVerifyTest() throws Exception {
        feline.getFood("Хищник");
        Mockito.verify(feline).getFood("Хищник");

    }
}
