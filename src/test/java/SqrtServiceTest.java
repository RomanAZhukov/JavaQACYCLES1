
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SqrtService;

public class SqrtServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Sqrt.csv")
    public void shouldCalcExact(int expected, int valueX, int valueY) {
        SqrtService service = new SqrtService();

        int actual = service.calcSqrt(valueX, valueY);

        Assertions.assertEquals(expected, actual);
    }


}

