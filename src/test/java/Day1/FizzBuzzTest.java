package Day1;

import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

public class FizzBuzzTest {

    @Test
    public void if_divided_by3_Fizz(){
        Assert.assertEquals(
        new FizzBuzz(3).toString(),"Fizz");
    }

    @Test
    public void if_divided_by5_Buzz(){
        Assert.assertEquals(
                new FizzBuzz(5).toString(),"Buzz");

    }

    @Test
    public void if_divided_by15_FizzBuzz(){
        Assert.assertEquals(
                new FizzBuzz(15).toString(),"FizzBuzz");

    }

    @Test
    public void returnNumber_test(){
        Assert.assertEquals(new FizzBuzz(2).toString(),"2");
    }

    @Test
    public void test_checkDuration(){
        Instant start = Instant.now();

        for(int i=0;i<1_000_000;i++){
           new FizzBuzz(i).toString();

        }

        Instant end = Instant.now();

        long duration = Duration.between(start,end).toMillis();
        System.out.println("Duration: "+duration);

    }



    public void test_checkDuration_v2(){
        Instant start = Instant.now();

        for(int i=0;i<1_000_000;i++){
            new FizzBuzz(i).toString();

        }

        Instant end = Instant.now();

        long duration = Duration.between(start,end).toMillis();
        System.out.println("Duration: "+duration);

    }
}
