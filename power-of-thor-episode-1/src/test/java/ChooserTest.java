import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChooserTest {

    @Test
    public void shouldReturnNorthIfLightIsUp() {
        PlayerPosition playerPosition= new PlayerPosition(0,1);
        String choose = new Chooser().getChoose(playerPosition, 0, 0);
        assertEquals("N", choose);
    }

    @Test
    public void shouldReturnSouthIfLightIsDown() {
        PlayerPosition playerPosition= new PlayerPosition(0,0);
        String choose = new Chooser().getChoose(playerPosition, 0, 1);
        assertEquals("S", choose);
    }

    @Test
    public void shouldReturnEastIfLightIsOnRight() {
        PlayerPosition playerPosition= new PlayerPosition(0,0);

        String choose = new Chooser().getChoose(playerPosition, 1, 0);
        assertEquals("E", choose);
    }

    @Test
    public void shouldReturnWestIfLightIsOnLeft() {
        PlayerPosition playerPosition= new PlayerPosition(1,0);

        String choose = new Chooser().getChoose(playerPosition, 0, 0);
        assertEquals("W", choose);
    }

    @Test
    public void shouldReturnNorthEastIfLightIsOnTopRight() {
        PlayerPosition playerPosition= new PlayerPosition(4,1);

        String choose = new Chooser().getChoose(playerPosition, 5, 0);
        assertEquals("NE", choose);
    }

    @Test
    public void shouldReturnSouthEastIfLightIsOnDownRight() {
        PlayerPosition playerPosition= new PlayerPosition(4,0);

        String choose = new Chooser().getChoose(playerPosition, 5, 1);
        assertEquals("SE", choose);
    }

    @Test
    public void shouldReturnSouthWestIfLightIsOnDownLeft() {
        PlayerPosition playerPosition= new PlayerPosition(6,0);

        String choose = new Chooser().getChoose(playerPosition, 5, 1);
        assertEquals("SW", choose);
    }

    @Test
    public void shouldReturnNorthWestIfLightIsOnTopLeft() {
        PlayerPosition playerPosition= new PlayerPosition(6,1);

        String choose = new Chooser().getChoose(playerPosition, 5, 0);
        assertEquals("NW", choose);
    }

    @Test
    public void shouldUpdatePlayerPosition() {
        PlayerPosition playerPosition= new PlayerPosition(0,0);
        new Chooser().getChoose(playerPosition, 0, 2);
        assertEquals(1, playerPosition.getY());
    }

}