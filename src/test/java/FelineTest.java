import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void felineFamilyTest() {
        String expectedResult = "Кошачьи";
        assertEquals(expectedResult, feline.getFamily());
    }

    @Test
    public void felineFoodIsMeatTest() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, feline.eatMeat());
    }
    @Test
    public void getKittenValueFelineTest() {
        Feline feline = new Feline();
        int expectedCount = 1;
        int actualCount = feline.getKittens();
        assertEquals(expectedCount, actualCount);
    }
}
