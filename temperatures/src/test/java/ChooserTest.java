import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ChooserTest {
    @Test
    public void shouldReturnValueNearZero() {
        List<Integer> inputs = Arrays.asList(100,-100,10);
        String choose = new Chooser().getChoose(inputs);
        assertEquals("10", choose);
    }

    @Test
    public void shouldReturnPositiveValue() {
        List<Integer> inputs = Arrays.asList(100,-100);
        String choose = new Chooser().getChoose(inputs);
        assertEquals("100", choose);
    }

    @Test
    public void shouldReturnValueNearZeroOnlyNegative() {
        List<Integer> inputs = Arrays.asList(-90,-100);
        String choose = new Chooser().getChoose(inputs);
        assertEquals("-90", choose);
    }

    @Test
    public void shouldReturnZeroIfNoValues() {
        List<Integer> inputs = Collections.emptyList();
        String choose = new Chooser().getChoose(inputs);
        assertEquals("0", choose);
    }

}