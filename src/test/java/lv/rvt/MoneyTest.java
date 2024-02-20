package lv.rvt;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import money.Money;

public class MoneyTest {
    @Test
    public void testPlusMethod() {
        Money mon1 = new Money(1, 85);
        Money mon2 = new Money(2, 90);
        Money result1 = mon1.plus(mon2);
        assertEquals(4, result1.euros());
        assertEquals(75, result1.cents());
    }

    @Test
    public void testMinusMethod() {
        Money mon1 = new Money(2, 95);
        Money mon2 = new Money(2, 90);
        Money result1 = mon1.minus(mon2);
        assertEquals(0, result1.euros());
        assertEquals(5, result1.cents());
    }

    @Test
    public void testLessMethod() {
        Money mon1 = new Money(5, 0);
        Money mon2 = new Money(5, 10);
        boolean result = mon1.lessThan(mon2);
        assertTrue(result);
    }
}