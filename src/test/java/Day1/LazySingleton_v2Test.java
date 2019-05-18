package Day1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LazySingleton_v2Test {

    @Test
    public void getInstance_false() {
        Assert.assertNotEquals(LazySingleton_v2.getInstance(),LazySingleton_v2.getInstance());

    }

    @Test
    public void getInstance_true(){
        Assert.assertEquals(LazySingleton_v2.getInstance(),LazySingleton_v2.getInstance());
    }
}