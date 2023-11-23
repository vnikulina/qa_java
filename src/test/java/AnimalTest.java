import com.example.Animal;
import org.junit.Test;

import java.util.List;

import static com.example.constants.AnimalFood.*;
import static com.example.constants.AnimalKinds.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class AnimalTest {
    Animal animal = new Animal();

    @Test
    public void herbivorousAnimalEatsPlantsTest() throws Exception {
        List<String> expectedResult = HERB_FOOD;
        assertEquals("Травоядные это не едят", expectedResult, animal.getFood(HERBIVORUS));
    }

    @Test
    public void predatorAnimalEatsMeetTest() throws Exception {
        List<String> expectedResult = MEET_FOOD;
        assertEquals("Хищники это не едят", expectedResult, animal.getFood(PREDATOR));
    }

    @Test
    public void otherAnimalKindGetsExceptionTest() throws Exception {
        String expectedResult = "Неизвестный вид животного, используйте значение "+HERBIVORUS+" или "+PREDATOR;
        assertThrows(expectedResult, Exception.class, () -> animal.getFood("Паукообразное"));
    }

    @Test
    public void getFamilyAnimalReturnsCorrectInfoTest() throws Exception {
        String expectedResult = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expectedResult, animal.getFamily());
    }
}
