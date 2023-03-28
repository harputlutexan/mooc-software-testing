package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    @Test
    public void testMirrorString(){
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("adadkada");
        Assertions.assertEquals("ada",result);
    }

    @Test
    public void testMirrorSymmetricString(){
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("adakada");
        Assertions.assertEquals("ada",result);
    }

}
