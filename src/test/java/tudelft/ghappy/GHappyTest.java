package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tudelft.chocolate.ChocolateBags;

public class GHappyTest {

    @Test
    public void isGHappyAtFirst() {
       GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("ggxxxgg");
        Assertions.assertTrue(result);
    }

    @Test
    public void isGHappyAtMid() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("xggyxg");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void isGHappyAtFinal() {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy("xyxgg");
        Assertions.assertEquals(true, result);
    }
}
