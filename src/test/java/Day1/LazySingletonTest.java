package Day1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LazySingletonTest {

    @Test
    public void getInstance_true() {
        Assert.assertEquals(LazySingleton.getInstance(),LazySingleton.getInstance());
    }

    @Test
    public void getInstance_false() {
        Assert.assertNotEquals(LazySingleton.getInstance(),LazySingleton.getInstance());
    }
}