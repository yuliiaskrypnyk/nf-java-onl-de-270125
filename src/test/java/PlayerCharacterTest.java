import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerCharacterTest {
    @BeforeEach
    void resetAllXY() {
        PlayerCharacter.x = 0;
        PlayerCharacter.y = 0;
    }

    @Test
    void getX_ShouldReturn0_WhenStart() {
        int expected = 0;
        int actual = PlayerCharacter.getX();
        assertEquals(expected, actual);
    }

    @Test
    void getY_ShouldReturn0_WhenStart() {
        int expected = 0;
        int actual = PlayerCharacter.getY();
        assertEquals(expected, actual);
    }

    @Test
    void move_ShouldReturn1_WhenW() {
        int actual = PlayerCharacter.move("W");
        assertEquals(1, actual);
    }

    @Test
    void move_ShouldReturn1_WhenS() {
        int actual = PlayerCharacter.move("S");
        assertEquals(-1, actual);
    }

    @Test
    void move_ShouldReturn1_WhenD() {
        int actual = PlayerCharacter.move("D");
        assertEquals(1, actual);
    }

    @Test
    void move_ShouldReturn1_WhenA() {
        int actual = PlayerCharacter.move("A");
        assertEquals(-1, actual);
    }
}
