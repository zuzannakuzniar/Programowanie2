package Day1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZłotówkaTest {


    @Test
    public void test1_ToString() {

        Assert.assertEquals("2.0 PLN", new Złotówka(2.00).toString());
        Assert.assertEquals("2.00 PLN", new Złotówka(4).toString());

    }

    @Test
    public void test2_toString(){
        Assert.assertEquals("7,50 PLN",new Złotówka(7.50).toString());
        Assert.assertEquals("15,25 PLN",new Złotówka(15.25).toString());
    }

    @Test
    public void test_Equals(){
        Złotówka z1 = new Złotówka(7.5);
        Złotówka z2 = new Złotówka(7.5);

        Assert.assertEquals(z1,z2);
    }

    @Test
    public void test2_Equals(){
        Złotówka z1 = new Złotówka(7.5);
        Złotówka z2 = new Złotówka(7.5);

        Assert.assertNotEquals(z1,z2);
    }

    @Test
    public void test_Subtraction(){
        Assert.assertEquals(new Złotówka(1.03).minus(new Złotówka(0.42)),new Złotówka(0.61));
    }
}