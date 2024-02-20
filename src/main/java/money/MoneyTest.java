package money;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoneyTest {
    public static void main(String[] args) {
        Money a = new Money(5);
        Money b = new Money(5, 50);
        
        System.out.println(a.equals(b));
    }
    
    @Test
    public void isMoneyEqual() {
        Money mon1 = new Money(5);
        Money mon2 = new Money(5, 50);
        
        assertEquals(mon1, mon2);
    }
}
