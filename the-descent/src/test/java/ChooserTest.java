import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ChooserTest {

    @Test
    public void shouldReturnIndexOfHighest() {
        String highestMountain = new Chooser().findHighestMountain(Arrays.asList(1, 2, 3, 4, 5));
        Assert.assertEquals("4", highestMountain);
    }


    @Test
    public void shouldReturnIndexOfHighest2() {
        String highestMountain = new Chooser().findHighestMountain(Arrays.asList(5, 4, 3, 2, 1));
        Assert.assertEquals("0", highestMountain);
    }


}