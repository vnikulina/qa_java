import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class ParametrizedLionTest {
    private final String sexTest;
    private final boolean hasManeTest;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    Feline feline;

    public ParametrizedLionTest(String sexTest, boolean hasManeTest){
        this.sexTest = sexTest;
        this.hasManeTest = hasManeTest;
    }
    @Parameterized.Parameters
    public static Object [][] lionParams(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void lionSexTest()throws Exception{
        Lion lion = new Lion(sexTest,feline);
        Assert.assertEquals(hasManeTest, lion.doesHaveMane());
    }
}