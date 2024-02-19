import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class TestFeline {

    private final int factValue;
    private final int expValue;

    public TestFeline(int factValue, int expValue) {
        this.factValue = factValue;
        this.expValue = expValue;
    }

    @Parameterized.Parameters
    public static Object[][] testFeline() {
        return new Object[][]{
                {2, 2},
                {1, 1},
                {3, 2}
        };
    }

    @Test
    public void test() {
        Feline feline = new Feline();
        assertEquals(expValue, feline.getKittens(factValue));
    }
}
