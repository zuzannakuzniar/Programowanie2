package Day2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class QueueSDATest {

    @Test
    public void capacityTest() {
        Assert.assertEquals(new QueueSDA(5).getCapacity(), 5);
    }

    @Test
    public void stringAddTest() {
        QueueSDA queueSDA = new QueueSDA(10);
        queueSDA.push("Zuzia");
        queueSDA.push("Gryzka");
        Assert.assertEquals(queueSDA.getSize(), 2);

        Assert.assertEquals(queueSDA.peek(), "Zuzia");

    }

    @Test
    public void exceptionTest() {
        QueueSDA queueSDA = new QueueSDA(3);
        queueSDA.pop();
    }

    @Test
    public void stringPopTest() {
        QueueSDA queueSDA = new QueueSDA(4);
        queueSDA.push("Zuzia");
        queueSDA.push("Gryzka");
        queueSDA.push("Kinia");
        queueSDA.push("Ania");
        queueSDA.pop();
        Assert.assertEquals(queueSDA.peek(), "Gryzka");

    }

    @Test
    public void checkNextItem() {
        QueueSDA queueSDA = new QueueSDA(5);
        queueSDA.push("Zuzia");
        queueSDA.push("Gryzka");
        queueSDA.push("Kinia");
        queueSDA.push("Ania");
        queueSDA.pop();
        Assert.assertEquals(queueSDA.peek(), "Gryzka");
    }

    @Test
    public void queueSizeTest() {
        QueueSDA queueSDA = new QueueSDA(10);
        queueSDA.push("Zuzia");
        queueSDA.push("Gryzka");
        Assert.assertEquals(queueSDA.getSize(), 2);
    }

    @Test
    public void printQueueTest() {
        QueueSDA queueSDA = new QueueSDA(2);
        queueSDA.push("Zuzia");
         Assert.assertEquals(queueSDA.print(),"Size: 1, elements: [ Zuzia ]");
    }

    @Test
    public void typyGeneryczneTest(){
        QueueSDA queueSDA = new QueueSDA(3);
        queueSDA.push("a");
        queueSDA.push(1);
        queueSDA.push(new Date());

        Assert.assertEquals(queueSDA.getSize(),3);

        QueueSDA<Integer> queueInt = new QueueSDA<>(5);
        QueueSDA<Double> queueDouble = new QueueSDA<>(6);
        QueueSDA<String> queueString = new QueueSDA<>(7);
        QueueSDA<Date> queueDate = new QueueSDA<>(8);

        Assert.assertEquals(queueInt.getSize(),5);
        Assert.assertEquals(queueDouble.getSize(),6);
        Assert.assertEquals(queueString.getSize(),7);
        Assert.assertEquals(queueDate.getSize(),8);

    }
}